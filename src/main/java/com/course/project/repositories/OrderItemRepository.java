package com.course.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entities.OrderItem;
import com.course.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
