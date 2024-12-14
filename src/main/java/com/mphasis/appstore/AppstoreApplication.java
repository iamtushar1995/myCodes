package com.mphasis.appstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppstoreApplication {

	public static void main(String[] args) {
		System.out.println("Appstore Consumer Started");
		SpringApplication.run(AppstoreApplication.class, args);
	}

}
