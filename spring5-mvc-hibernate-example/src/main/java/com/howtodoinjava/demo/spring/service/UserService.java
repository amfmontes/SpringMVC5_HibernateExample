package com.howtodoinjava.demo.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.demo.spring.model.User;



public interface UserService {
	   void save(User user);
	 
	   List<User> list();
	}
	 
	