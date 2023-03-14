package com.webcorestone.EduFinance.app;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableEncryptableProperties
public class EduFinanceApplication {
	
	

		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}

	public static void main(String[] args) {
		SpringApplication.run(EduFinanceApplication.class, args);
	}

}
