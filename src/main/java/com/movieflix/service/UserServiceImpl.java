package com.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movieflix.entities.UserEntity;
import com.movieflix.exception.ResourceNotFoundException;
import com.movieflix.exception.ResourceNotInSpecifiedLimit;
import com.movieflix.repsitory.UserRepository;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserRepository repository;

	@Override
	public List<UserEntity> showAllUsers()
	{
		return repository.showAllUsers();
	}

	@Override
	public UserEntity showOneUser(String uid)
	{
		UserEntity existing = repository.showOneUser(uid);
		if (existing == null)
		{
			throw new ResourceNotFoundException("User resource not found ");
		}
		return existing;
	}

	@Override
	@Transactional
	public UserEntity createUser(UserEntity user)
	{
		if ((user.getEmail() == null) || (user.getPassword() == null))
		{
			throw new ResourceNotInSpecifiedLimit(
					"enter all the  fields");
		}
		return repository.createUser(user);
	}

	@Override
	@Transactional
	public UserEntity updateUser(String uid, UserEntity user)
	{
		UserEntity existing = repository.showOneUser(uid);
		if (existing == null)
		{
			throw new ResourceNotFoundException("User resorce not found");
		}
		return repository.updateUser(user);
	}

	@Override
	@Transactional
	public void deleteUser(String uid)
	{
		UserEntity existing = repository.showOneUser(uid);
		if (existing == null)
		{
			throw new ResourceNotFoundException("user resorce not found ");
		}
		repository.deleteUser(existing);

	}

}
