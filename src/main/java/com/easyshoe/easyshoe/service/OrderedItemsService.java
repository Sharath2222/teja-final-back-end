package com.easyshoe.easyshoe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyshoe.easyshoe.repository.OrderedItemsRepository;

@Service
public class OrderedItemsService {

    @Autowired
    private OrderedItemsRepository orderedItemsRepository;
}
