package com.movieflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movieflix.entities.UserEntity;
import com.movieflix.service.UserService;

@RestController
public class UserController
{
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET, value = "/movie/users")
	public List<UserEntity> showAllUsers()
	{
		return service.showAllUsers();
	}


	@RequestMapping(method = RequestMethod.GET, value = "/movie/users/{id}")
	public UserEntity findOneUser(@PathVariable("id") String uid)
	{
		return service.showOneUser(uid);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/movie/users")
	public UserEntity createUser(@RequestBody UserEntity user)
	{
		return service.createUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/movie/users/{id}")
	public UserEntity updateUser(@PathVariable("id") String uid,
			@RequestBody UserEntity user)
	{
		return service.updateUser(uid, user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/movie/users/{id}")
	public void deleteUser(@PathVariable("id") String uid)
	{
		service.deleteUser(uid);
	}

}
