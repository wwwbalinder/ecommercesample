package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.UserAccountModel;
import com.example.entity.UserAccount;

@Service
public interface UserAccountService {
	
	public UserAccountModel createNewUser(UserAccount userAccount) throws Exception;
	
	public UserAccountModel userlookup(Long userId);

}
