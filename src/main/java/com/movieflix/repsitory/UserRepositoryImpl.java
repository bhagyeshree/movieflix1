package com.movieflix.repsitory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.movieflix.entities.UserEntity;

@Repository
public class UserRepositoryImpl implements UserRepository
{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<UserEntity> showAllUsers()
	{
		TypedQuery<UserEntity> query = entityManager.createNamedQuery(
				"UserEntity.findAll", UserEntity.class);
		return query.getResultList();
	}

	@Override
	public UserEntity showOneUser(String uid)
	{
		return entityManager.find(UserEntity.class, uid);
	}

	@Override
	public UserEntity createUser(UserEntity user)
	{
		entityManager.persist(user);
		return user;
	}

	@Override
	public UserEntity updateUser(UserEntity user)
	{
		entityManager.merge(user);
		return user;
	}

	@Override
	public void deleteUser(UserEntity user)
	{
		entityManager.remove(user);

	}

}
