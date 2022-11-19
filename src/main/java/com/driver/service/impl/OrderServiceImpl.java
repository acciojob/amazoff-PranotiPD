package com.driver.service.impl;

import com.driver.Order;

import com.driver.repository.OrderRepository;
import com.driver.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    @Override
    public Order getOrderById(String id) {
        return orderRepository.getOrderById(id);
    }

    @Override
    public List<String> getAllOrders(){
        return orderRepository.getAllOrders();
    }
}
