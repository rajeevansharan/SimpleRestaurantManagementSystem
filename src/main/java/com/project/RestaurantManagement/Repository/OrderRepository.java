package com.project.RestaurantManagement.Repository;

import com.project.RestaurantManagement.Entity.Order;
import com.project.RestaurantManagement.Entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByStatus(OrderStatus status);
    List<Order> findByTableNumber(String tableNumber);
}