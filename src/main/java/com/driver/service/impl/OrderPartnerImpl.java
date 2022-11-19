package com.driver.service.impl;

import com.driver.repository.OrderPartnerRepository;
import com.driver.service.OrderPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPartnerImpl implements OrderPartnerService {
    @Autowired
    OrderPartnerRepository orderPartnerRepository;

    @Override
    public void addOrderPartner(String orderId, String partnerId) {
        orderPartnerRepository.addOrderPartner(orderId, partnerId);
    }

    @Override
    public int getOrderCountByPartnerId(String partnerId) {
        return orderPartnerRepository.getOrderCountByPartnerId(partnerId);
    }

    @Override
    public List<String> getListOfOrdersByPartnerId(String partnerId){
        return orderPartnerRepository.getListOfOrdersByPartnerId(partnerId);
    }
}
