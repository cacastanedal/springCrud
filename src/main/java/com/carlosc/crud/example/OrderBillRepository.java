package com.carlosc.crud.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBillRepository extends JpaRepository<OrderBill, Integer> {
}
