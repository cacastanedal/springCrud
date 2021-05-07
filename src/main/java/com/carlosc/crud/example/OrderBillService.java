package com.carlosc.crud.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class OrderBillService {

    @Autowired
    public OrderBillRepository Orepo;

    @Autowired
    public ProductOrderRepository Prepo;

    public void save(OrderBill orderBill, Set<ProductOrder> productOrders){
        Orepo.save(orderBill);

        for(ProductOrder p : productOrders){
            Prepo.save(p);
        }
    }
}
