package com.driver.service;

import com.driver.DeliveryPartner;

public interface DeliveryPartnerService {

    void addPartner(String partnerId);

    DeliveryPartner getPartnerById(String partnerId);
}
