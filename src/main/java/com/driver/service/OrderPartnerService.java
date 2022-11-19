package com.driver.service;


import java.util.List;

public interface OrderPartnerService {

    void addOrderPartner(String orderId, String partnerId);

    int getOrderCountByPartnerId(String partnerId);

    List<String> getListOfOrdersByPartnerId(String partnerId);
}
