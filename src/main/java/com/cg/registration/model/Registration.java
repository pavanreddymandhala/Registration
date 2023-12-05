package com.cg.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @Size(min = 3, max = 20, message = "Username should be between 3 and 20 characters")
	private String username;
	
	@Email(message = "Email should be valid")
	private String email;
	
    @Size(min = 8, message = "Password should be at least 8 characters long")
	private String password;
    
    @Size(min = 8, message = "Password should be at least 8 characters long")
    private String confirmPassword;
    
    
	@NotBlank(message = "Role should not be blank")
	private String role;
	
	

}
