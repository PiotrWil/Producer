package com.example.carrental;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}

}

@RestController
class MyCon{

	@GetMapping("/fraud")
	ResponseEntity<List<String>> fraud(){
	return ResponseEntity.status(201).body(Arrays.asList("aaa", "bbb"));

	}
}
