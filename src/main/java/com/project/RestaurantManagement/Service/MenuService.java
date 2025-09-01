package com.project.RestaurantManagement.Service;

import com.project.RestaurantManagement.Entity.Category;
import com.project.RestaurantManagement.Entity.MenuItem;
import com.project.RestaurantManagement.Repository.CategoryRepository;
import com.project.RestaurantManagement.Repository.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final CategoryRepository categoryRepository;
    private final MenuItemRepository menuItemRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findByAvailableTrue();
    }

    public List<MenuItem> getMenuItemsByCategory(Long categoryId) {
        return menuItemRepository.findByCategoryId(categoryId);
    }

    public MenuItem saveMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
