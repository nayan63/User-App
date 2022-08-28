package com.mindtree.userapp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.userapp.entity.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findById(int id);
}