package com.driver.repository;

import com.driver.DeliveryPartner;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DeliveryPartnerRepository {

    public HashMap<String, DeliveryPartner> deliveryPartnerHashMap = new HashMap<>();

    DeliveryPartnerRepository(){
        this.deliveryPartnerHashMap = new HashMap<String , DeliveryPartner>();
    }

    public void addPartner(String partnerId){
        DeliveryPartner deliveryPartner = new DeliveryPartner(partnerId);
        deliveryPartnerHashMap.put(partnerId, deliveryPartner);
    }

    public DeliveryPartner getPartnerById(String partnerId){
        return deliveryPartnerHashMap.get(partnerId);
    }
}
