package com.carlosc.crud.example;

import javax.persistence.*;

@Entity
@Table(name= "product_bill")
public class ProductOrder {
    private Integer id;
    private Integer product_id;
    private Integer order_id;
    private Integer quantity;
    private Double total;

    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private OrderBill order;

    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;

    public ProductOrder() {
    }

    public ProductOrder(Integer id, Integer product_id, Integer order_id, Integer quantity, Double total) {
        this.id = id;
        this.product_id = product_id;
        this.order_id = order_id;
        this.quantity = quantity;

        this.total = quantity * product.getPrice();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
