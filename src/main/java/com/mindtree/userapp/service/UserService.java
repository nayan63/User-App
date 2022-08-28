package com.mindtree.userapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.userapp.entity.User;

@Service
public interface UserService {
	List<User> allUsers();
	User UserById(int id);
	User addUser(User user);
	User deleteUser(int id);
	User editUser(User user, int id);
}
