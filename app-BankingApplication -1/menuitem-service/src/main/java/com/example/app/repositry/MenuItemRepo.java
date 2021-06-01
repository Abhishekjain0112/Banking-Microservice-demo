package com.example.app.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.MenuItem;



public interface MenuItemRepo extends JpaRepository<MenuItem, Long> {

	MenuItem findByMenuItemId(long menuItemId);
}
