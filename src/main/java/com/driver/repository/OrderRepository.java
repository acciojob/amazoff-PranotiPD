package com.driver.repository;

import com.driver.Order;
//import com.driver.dto.entryDto.OrderEntryDto;
//import com.driver.dto.responseDto.OrderResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import static com.driver.converter.OrderConverter.convertDtoToOrder;

@Repository
public class OrderRepository {

    public HashMap<String, Order> orderMap = new HashMap<>();

    public OrderRepository(){
        this.orderMap = new HashMap<String, Order>();
    }
    public void addOrder(Order order){
        orderMap.put(order.getId(), order);
    }

    public Order getOrderById(String id){

        return orderMap.get(id);
    }

    public List<String> getAllOrders(){
        List<String> list = new ArrayList<>();
        for(String key : orderMap.keySet()){
            list.add(key);
        }
        return list;
    }
}
