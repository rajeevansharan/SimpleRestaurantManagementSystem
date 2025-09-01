package com.project.RestaurantManagement.Controller;

import com.project.RestaurantManagement.Entity.Order;
import com.project.RestaurantManagement.Entity.OrderStatus;
import com.project.RestaurantManagement.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

}
