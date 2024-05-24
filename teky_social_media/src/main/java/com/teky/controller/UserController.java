package com.teky.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teky.models.User;
import com.teky.repository.UserRepository;
import com.teky.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		User savedUser = userService.registerUser(user);
		return savedUser; 
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		
		List<User> users = userRepository.findAll();
		
		return users;
	}
	
	@GetMapping("/users/{userid}")
	public User getUsersById(@PathVariable("userid")Integer id) throws Exception {
		
		Optional<User> user = userRepository.findById(id);
		
		if(user.isPresent())
		{
			return user.get();
		}
		
		throw new Exception("user not exist userid" + id);
	}
	
	@DeleteMapping("user/{userId}")
	public String deleteUser(@PathVariable("userId")Integer userId)
	{
		return "user deleted successfully id : " + userId;
	}

	
	@PutMapping("/users/{userId}")
	public User updateUser(@RequestBody User user,@PathVariable Integer userId) throws Exception 
	{
		User updatedUser = userService.updateUser(user,userId);
		return updatedUser;
	}
	
	@PutMapping("/users/follow/{userId1}/{userId2}")
	public User followUserHandler(@PathVariable Integer userId1,@PathVariable Integer userId2) throws Exception
	{
		User user = userService.followUser(userId1,userId2);
		return user;
	}
	
	@GetMapping("/users/search")
	public List<User> searchUser(@RequestParam("query")String query)
	{
		List<User> users = userService.searchUser(query);
		return users;
	}
}
