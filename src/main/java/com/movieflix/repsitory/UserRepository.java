package com.movieflix.repsitory;

import java.util.List;

import com.movieflix.entities.UserEntity;

public interface UserRepository
{
	public List<UserEntity> showAllUsers();

	public UserEntity showOneUser(String uid);

	public UserEntity createUser(UserEntity user);

	public UserEntity updateUser(UserEntity user);

	public void deleteUser(UserEntity existing);
}
