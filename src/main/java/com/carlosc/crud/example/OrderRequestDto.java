package com.carlosc.crud.example;

import java.util.Set;

public class OrderRequestDto {
    private OrderBill orderBill;
    private Set<ProductOrder> productOrders;

    public OrderRequestDto(OrderBill orderBill, Set<ProductOrder> productOrders) {
        this.orderBill = orderBill;
        this.productOrders = productOrders;
    }

    public OrderBill getOrderBill() {
        return orderBill;
    }

    public void setOrderBill(OrderBill orderBill) {
        this.orderBill = orderBill;
    }

    public Set<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(Set<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }
}
