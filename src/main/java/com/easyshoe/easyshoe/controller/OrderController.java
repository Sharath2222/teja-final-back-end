package com.easyshoe.easyshoe.controller;


import com.easyshoe.easyshoe.dto.CartDto;
import com.easyshoe.easyshoe.dto.OrderedItemsDto;
import com.easyshoe.easyshoe.model.OrderedItems;
import com.easyshoe.easyshoe.service.OrderService;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(
        origins = {"http://localhost:4788/"},
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}
)
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity createOrder(@RequestBody List<CartDto> cartItems) {
        orderService.createOrder(cartItems);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("get/all/{username}")
    public ResponseEntity<List<OrderedItemsDto>> getAllOrders(@PathVariable String username) {
        List<OrderedItemsDto> orderedItemsDto = new ArrayList<>();
        List<OrderedItems> orderedItems = orderService.getAllOrders(username);
        for(OrderedItems orderedItem: orderedItems) {
            OrderedItemsDto orderedItemDto = new OrderedItemsDto(orderedItem);
            orderedItemsDto.add(orderedItemDto);
        }
        return ResponseEntity.ok(orderedItemsDto);
    }
}
