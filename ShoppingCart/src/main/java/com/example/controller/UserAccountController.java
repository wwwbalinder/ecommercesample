package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserAccountModel;
import com.example.entity.UserAccount;
import com.example.service.UserAccountService;

@RestController
public class UserAccountController {

	@Autowired
	private UserAccountService userAccountService;
	
	@PostMapping("/user-account")
	public ResponseEntity<UserAccountModel> signUpNewUser(@RequestBody UserAccount userAccount) throws Exception  { 
			return new ResponseEntity<>(userAccountService.createNewUser(userAccount), HttpStatus.CREATED);
	}
	
	@GetMapping("/user-account/{userId}")
	public ResponseEntity<UserAccountModel> searchUserById(@PathVariable Long userId) throws Exception {
		return new ResponseEntity<>(userAccountService.userlookup(userId), HttpStatus.OK);
	}
}
