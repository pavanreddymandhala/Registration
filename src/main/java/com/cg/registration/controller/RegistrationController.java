package com.cg.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.registration.exception.RegistrationException;
import com.cg.registration.model.Registration;
import com.cg.registration.service.RegistrationServiceImpl;

import jakarta.validation.Valid;

@RestController
@ComponentScan
@RequestMapping("/register")
@CrossOrigin("*")
public class RegistrationController {
	@Autowired
	private RegistrationServiceImpl registrationServiceImpl;
	
	@PostMapping("/addUser")
	public ResponseEntity<?> saveUser(@Valid @RequestBody Registration user) throws Exception {
		if(user.getRole().equals("Admin")||user.getRole().equals("User")) {
			return ResponseEntity.ok(registrationServiceImpl.save(user));
		}
//		else if
//		{
//			return new ResponseEntity<>("Please Select a valid role",
//                    HttpStatus.INTERNAL_SERVER_ERROR);
//		}	
		else{
			throw new RegistrationException.InvalidRoleException("Please select a valid role (Admin or User).");
			
		}

	}

}








