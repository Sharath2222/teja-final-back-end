package com.easyshoe.easyshoe.service;

import com.easyshoe.easyshoe.model.product;
import com.easyshoe.easyshoe.repository.DishRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private AuthService authService;

    public void addDish(product dish){
        dishRepository.save(dish);
    }

    public void addAllDish(List<product> dishes){
        dishRepository.saveAll(dishes);
    }

    public List<product> getAllDishes(){
        return dishRepository.findAll();
    }

    public product getDishById(Long id){
        return dishRepository.findById(id).get();
    }

    public void delete(Long id){
        dishRepository.deleteById(id);
    }

    public  void update(product dish){
        dishRepository.save(dish);
    }
}
