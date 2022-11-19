package com.driver.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class OrderPartnerRepository {

    public HashMap<String, List<String> > orderPartnerMap;

    OrderPartnerRepository(){
        this.orderPartnerMap = new HashMap<String,List<String> >();
    }

    public void addOrderPartner(String orderId, String partnerId){
        List<String> list;
        if(orderPartnerMap.containsKey(partnerId)){
            list = orderPartnerMap.get(partnerId);
        }
        else{
            list = new ArrayList<>();
        }
        list.add(orderId);
        orderPartnerMap.put(partnerId, list);
    }

    public int getOrderCountByPartnerId(String partnerId){
        if(!orderPartnerMap.containsKey(partnerId)){
            return 0;
        }
        return orderPartnerMap.get(partnerId).size();
    }

    public List<String> getListOfOrdersByPartnerId(String partnerId){
        if(!orderPartnerMap.containsKey(partnerId)){
            return new ArrayList<>();
        }
        return orderPartnerMap.get(partnerId);
    }
}
