package com.Paulo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Paulo.curso.entities.OrderItem;
import com.Paulo.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}