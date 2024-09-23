package com.tahrioussama.orderservice.repos;


import com.tahrioussama.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
