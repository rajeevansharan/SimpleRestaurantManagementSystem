package com.project.RestaurantManagement.Repository;


import com.project.RestaurantManagement.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}