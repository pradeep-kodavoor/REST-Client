package com.practice.RESTClient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);

		List<Book> books = new ArrayList<>();
		books.add(new Book("Effective Java", "Joshua Blotch"));
		books.add(new Book("Clean Code", "Robert C Martin"));

		RestTemplate restTemplate = new RestTemplate();

		restTemplate.postForObject("http://localhost:8080/books", books, ResponseEntity.class);

	}

}
