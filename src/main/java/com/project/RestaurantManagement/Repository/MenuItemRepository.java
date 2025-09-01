package com.project.RestaurantManagement.Repository;

import com.project.RestaurantManagement.Entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByAvailableTrue();
    List<MenuItem> findByCategoryId(Long categoryId);
}