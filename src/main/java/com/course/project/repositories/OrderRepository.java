package com.course.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
