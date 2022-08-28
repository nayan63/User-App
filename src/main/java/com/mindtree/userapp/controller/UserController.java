package com.mindtree.userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.userapp.entity.User;
import com.mindtree.userapp.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<User> displayAll()
	{
		return userService.allUsers();
	}
	
	@GetMapping("/{id}")
	public User getUserByID(@PathVariable int id)
	{
		User user = userService.UserById(id);
		return user;
	}
	
	@PostMapping
	public User addUserDetails(@RequestBody User user)
	{
		User val = userService.addUser(user);
		return val;
	}
	
	@DeleteMapping("/delete-user")
	public User deleteUser(@RequestParam int id)
	{
		return userService.deleteUser(id);
	}
	
	@PutMapping("/edit/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id)
	{
		return userService.editUser(user, id);
	}
	
	
}
