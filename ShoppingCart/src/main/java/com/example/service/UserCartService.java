package com.example.service;

import java.util.Collection;

import com.example.data.CartData;
import com.example.entity.UserCart;

public interface UserCartService {

	public Collection<CartData> getActiveCart(Long userId) throws Exception;
	public UserCart createCart(CartData cartAction) throws Exception;
	public UserCart updateCart(CartData cartAction) throws Exception;
	
}
