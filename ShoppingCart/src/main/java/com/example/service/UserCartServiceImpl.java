package com.example.service;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.CartData;
import com.example.entity.UserCart;
import com.example.repository.UserCartRepository;
import com.example.service.UserCartService;

@Service
public class UserCartServiceImpl implements UserCartService {
	
	@Autowired
	UserCartRepository userCartRepository;
	
	public Collection<CartData> getActiveCart(Long userId) throws Exception {
		Collection<CartData> cartItems = new HashSet<CartData>() ;
//		 userCartRepository.getUserCart(userId).forEach(resutlSet->{
//			
//			CartData cartData = CartData.builder()
//											.userId(resutlSet.getUserId())
//											.cartId(resutlSet.getCartId())
//											.itemId(resutlSet.getItemId())
//											.itemQty(resutlSet.getItemQty())
//											.build();											
//			
//			cartItems.add(cartData);
//		});
		 
		 return cartItems;
	}
	
	public UserCart createCart(CartData cartData) throws Exception{
//		UserCart userCart = UserCart.builder()
//										.cartId(cartData.getCartId())
//										.userId(cartData.getUserId())
//										.itemId(cartData.getItemId())
//										.itemQty(cartData.getItemQty())
//										.build();
//		
//		return userCartRepository.saveAndFlush(userCart);
		return null;
	}
	
	public UserCart updateCart(CartData cartData) throws Exception{
//		UserCart userCart = UserCart.builder()
//				.userId(cartData.getUserId())
//				.itemId(cartData.getItemId())
//				.itemQty(cartData.getItemQty())
//				.build();
//		
//		return userCartRepository.saveAndFlush(userCart);
		return null;
	}
	
}
