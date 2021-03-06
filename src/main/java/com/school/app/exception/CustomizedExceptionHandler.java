package com.school.app.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomizedExceptionHandler 
{
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> resourceNotFound(ResourceNotFoundException error , WebRequest webRequest)
	{
		ErrorDetails errorDetails  = new ErrorDetails(new Date(), HttpStatus.NOT_FOUND, error.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorDetails> userNotFound(UserNotFoundException error , WebRequest webRequest)
	{
		ErrorDetails errorDetails  = new ErrorDetails(new Date(), HttpStatus.NOT_FOUND, error.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}

	/*@ExceptionHandler(ResourceAlreadyExistException.class)
	public ResponseEntity<ErrorDetails> resourceAlreadyExists(ResourceAlreadyExistException error , WebRequest webRequest)
	{
		ErrorDetails errorDetails  = new ErrorDetails(new Date(), HttpStatus.BAD_REQUEST, error.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}*/
	
	@ExceptionHandler(UnauthorisedException.class)
    public ResponseEntity<ErrorDetails> unauthorizedException(UnauthorisedException error,WebRequest webRequest)
	{
       
		ErrorDetails errorDetails  = new ErrorDetails(new Date(), HttpStatus.NOT_FOUND, error.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.UNAUTHORIZED);
    }
	
	
	
}
