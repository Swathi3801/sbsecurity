package com.kgisl.springsecurityform;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kgisl.springsecurityform.Entity.Role;
import com.kgisl.springsecurityform.Repository.RoleRepository;

@SpringBootApplication
public class SpringsecurityformApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityformApplication.class, args);
	}
	@Bean
    public CommandLineRunner demo(RoleRepository roleRepo) {
        return (args) -> {
            Role role=new Role();
            role.setName("ROLE_ADMIN");
            roleRepo.save(role);
        };
    }
}
