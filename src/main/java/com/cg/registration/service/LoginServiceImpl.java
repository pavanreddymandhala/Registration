package com.cg.registration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import com.cg.registration.exception.RegistrationException;
import com.cg.registration.model.Registration;
import com.cg.registration.repository.RegistrationRepository;
@Service
public class LoginServiceImpl {
	@Autowired
    private RegistrationRepository registrationRepository;

//	@Override
    public Registration signIn(Long id,Registration userDetails)throws UserNotFoundException{
		Optional<Registration> user1=registrationRepository.findById(id);
		//Long staffInid=userDetails.getId();
		String userInName=userDetails.getUsername();
		if((user1.isPresent()))
		{
			String Name=user1.get().getUsername();
			if(Name.equals(userInName)) {
				return userDetails;
			}
			else {
				throw new UserNotFoundException("not found");
			}
		}
	}
   

}
