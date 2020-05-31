package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootCrudEmployeeApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootCrudEmployeeApplication.class, args);
		System.out.println("port:8081 run successfully!");
	}

}
