package com.driver.service.impl;

import com.driver.DeliveryPartner;
import com.driver.repository.DeliveryPartnerRepository;
import com.driver.service.DeliveryPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPartnerImpl implements DeliveryPartnerService {

    @Autowired
    DeliveryPartnerRepository deliveryPartnerRepository;

    @Override
    public void addPartner(String partnerId) {
       deliveryPartnerRepository.addPartner(partnerId);
    }

    @Override
    public DeliveryPartner getPartnerById(String id) {
        return deliveryPartnerRepository.getPartnerById(id);
    }
}
