package com.movieflix.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table
@NamedQueries(
{ @NamedQuery(name = "UserEntity.findAll", query = "select m from UserEntity m") })
public class UserEntity
{

	@Id
	@JsonProperty("UserId")
	private String id;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("LastName")
	private String lastName;

	@Column(unique = true)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String email;

	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	private String role;


	public UserEntity()
	{
		this.id = UUID.randomUUID().toString();
		this.role = "User";
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getRole()
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "UserEntity [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", role=" + role + "]";
	}

}
