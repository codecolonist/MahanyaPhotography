package com.codecolonist.MahanyaPhotography.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codecolonist.MahanyaPhotography.Exception.RestResponseEntityExceptionHandler;
import com.codecolonist.MahanyaPhotography.bean.LoginRequest;
import com.codecolonist.MahanyaPhotography.bean.LoginResponse;

@RestController
public class LoginController extends  RestResponseEntityExceptionHandler{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@RequestMapping(value="/userLogin",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<LoginResponse> UserLogin(@RequestBody LoginRequest loginRequest,HttpServletRequest servletRequest) throws Exception  {
		
		 
		
		LoginResponse loginResponse = new LoginResponse();
		
		
		if(loginRequest.getPassWord().equalsIgnoreCase("password")  ){
			
			loginResponse.setFirstName("RamkishoreRao");
			loginResponse.setLastName("Gujjeti");
			loginResponse.setServiceMessage("Welcome to MahanyaRam Photography");
			return new ResponseEntity<>(loginResponse,HttpStatus.OK);
			
		}else {
             throw new Exception();
			//loginResponse.setServiceMessage("Login failed to MahanyaRam Photography");
			
			//return new ResponseEntity<>(loginResponse,HttpStatus.EXPECTATION_FAILED);
			
		}
		
		
		
	}
	

	
}
