package com.course.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
