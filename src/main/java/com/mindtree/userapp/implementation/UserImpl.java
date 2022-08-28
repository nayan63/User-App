package com.mindtree.userapp.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.userapp.entity.User;
import com.mindtree.userapp.repository.UserRepository;
import com.mindtree.userapp.service.UserService;

@Component
public class UserImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> allUsers() {
		return userRepo.findAll();
	}

	@Override
	public User UserById(int id) {
		return userRepo.findById(id);
	}
	
	@Override
	public User addUser(User user)
	{
		return userRepo.save(user);
	}

	@Override
	public User deleteUser(int id) {
		User users = userRepo.findById(id);
		userRepo.deleteById(id);
		return users;
	}

	@Override
	public User editUser(User user, int id) {
		user.setUserId(id);
		userRepo.save(user);
		return user;
	}
	

}
