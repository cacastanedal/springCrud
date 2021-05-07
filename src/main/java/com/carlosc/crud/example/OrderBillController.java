package com.carlosc.crud.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderBillController {

    @Autowired
    private OrderBillService service;

    public void add(@RequestBody OrderRequestDto orderRequest) {
        service.save(orderRequest.getOrderBill(), orderRequest.getProductOrders());
    }
}
