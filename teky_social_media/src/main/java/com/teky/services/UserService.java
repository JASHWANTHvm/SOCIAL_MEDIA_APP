package com.teky.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

//import com.teky.controller.Public;
import com.teky.models.*;

public interface UserService {
	
	public User registerUser(User user);

	public User findUserById(Integer userld) throws Exception;

	public User findUserByEmail(String email) ;
	
	public String deleteUser(@PathVariable("userId")Integer userId);

	public User followUser(Integer userld1, Integer userld2) throws Exception;

	public User updateUser(User user,Integer userId) throws Exception;
	

	public List<User> searchUser(String query);

}
