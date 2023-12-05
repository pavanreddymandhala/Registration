package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = "com.cg.registration")

public class RegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}
//	@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(); 
//    }

}
