package com.myblog.bblogapp;

import com.myblog.bblogapp.entities.Role;
import com.myblog.bblogapp.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BblogappApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;
	@Bean

public ModelMapper modelMapper(){
	return new ModelMapper();
}
	public static void main(String[] args) {
		SpringApplication.run(BblogappApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Role adminRole= new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

		Role userRole = new Role();
		userRole.setName("USER_ADMIN");
		roleRepository.save(userRole);
	}
}
