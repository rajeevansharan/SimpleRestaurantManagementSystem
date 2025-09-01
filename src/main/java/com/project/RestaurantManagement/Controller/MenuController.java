package com.project.RestaurantManagement.Controller;

import com.project.RestaurantManagement.Entity.Category;
import com.project.RestaurantManagement.Entity.MenuItem;
import com.project.RestaurantManagement.Service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return menuService.getAllCategories();
    }

    @GetMapping("/items")
    public List<MenuItem> getAllMenuItems() {
        return menuService.getAllMenuItems();
    }

    @GetMapping("/categories/{categoryId}/items")
    public List<MenuItem> getMenuItemsByCategory(@PathVariable Long categoryId) {
        return menuService.getMenuItemsByCategory(categoryId);
    }

    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category) {
        return menuService.saveCategory(category);
    }

    @PostMapping("/items")
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuService.saveMenuItem(menuItem);
    }
}