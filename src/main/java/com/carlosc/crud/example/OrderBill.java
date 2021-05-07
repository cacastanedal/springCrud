package com.carlosc.crud.example;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "order_bill")
public class OrderBill {

    private Integer id;
    private String customer_name;

    @OneToMany
    private Set<ProductOrder> product_orders;

    public OrderBill() {}

    public OrderBill(Integer id, String customer_name) {
        this.id = id;
        this.customer_name = customer_name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
}
