package com.example.food.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long>{
	Coupon findByCouponCode(String couponCode);
}
