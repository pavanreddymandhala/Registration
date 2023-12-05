package com.cg.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.registration.exception.RegistrationException;
import com.cg.registration.model.Registration;
import com.cg.registration.repository.RegistrationRepository;


@Service
public class RegistrationServiceImpl {

//	@Autowired
//	private PasswordEncoder bcryptEncoder;

	
	@Autowired
	private RegistrationRepository registrationRepository;

	public Registration save(Registration user) {
		// TODO Auto-generated method stub
		Registration existingUser = registrationRepository.findByUsername(user.getUsername());

		if (existingUser != null) {
			// User with the same username already exists, throw an exception
			throw new RegistrationException("Username already exists: " + user.getUsername());
		}
		Registration login = new Registration();
		
		login.setUsername(user.getUsername());
		login.setEmail(user.getEmail());
		login.setPassword(user.getPassword());
//		login.setPassword(bcryptEncoder.encode(user.getPassword()));
//		login.setPassword(user.getPassword());
		login.setConfirmPassword(user.getConfirmPassword());
		login.setRole(user.getRole());
		
		return registrationRepository.save(login);

}
}
