package com.Paulo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Paulo.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
