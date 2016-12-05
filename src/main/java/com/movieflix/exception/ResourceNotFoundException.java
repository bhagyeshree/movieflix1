package com.movieflix.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = -4023066739005606899L;

	public ResourceNotFoundException(String message)
	{
		super(message);
	}
}
