package com.movieflix.service;

import java.util.List;

import com.movieflix.entities.UserEntity;

public interface UserService
{
	public List<UserEntity> showAllUsers();

	public UserEntity showOneUser(String uid);

	public UserEntity createUser(UserEntity user);

	public UserEntity updateUser(String uid, UserEntity user);

	public void deleteUser(String uid);

}
