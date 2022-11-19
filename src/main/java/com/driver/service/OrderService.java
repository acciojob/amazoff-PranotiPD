package com.driver.service;

import com.driver.Order;
//import com.driver.dto.entryDto.OrderEntryDto;
//import com.driver.dto.responseDto.OrderResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface OrderService {

    void addOrder(Order order);

    Order getOrderById(String id);

    List<String> getAllOrders();
}
