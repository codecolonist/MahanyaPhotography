package com.codecolonist.MahanyaPhotography.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codecolonist.MahanyaPhotography.Repository.MP_User;
import com.codecolonist.MahanyaPhotography.Repository.MpUserRepository;
import com.codecolonist.MahanyaPhotography.bean.RegistrationRequest;
import com.codecolonist.MahanyaPhotography.bean.RegistrationResponse;

@RestController
public class RegistrationController {
	
	@Autowired
	private MpUserRepository mpuserrepo;
	
	@RequestMapping(value="/register",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RegistrationResponse UserRegistration(@RequestBody RegistrationRequest registationRequest,HttpServletRequest servletRequest) throws Exception  {
		
		MP_User mpuser = new MP_User();		
		mpuser=registationRequest.getMpuser();
		mpuserrepo.save(mpuser);
		RegistrationResponse registrationResponse = new RegistrationResponse();		
		registrationResponse.setMpuser(mpuser);
		registrationResponse.setStatus("success");		
		return registrationResponse;
		
		
	}
	
	@RequestMapping(value="/allregs",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<MP_User> getAllUsers() {
		// This returns a JSON or XML with the users
		return mpuserrepo.findAll();
	}

}
