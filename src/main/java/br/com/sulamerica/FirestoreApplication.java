package br.com.sulamerica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sulamerica.service.FireStoreIntegrationImpl;

@SpringBootApplication
public class FirestoreApplication {

	@Autowired
	FireStoreIntegrationImpl fireStoreIntegrationImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(FirestoreApplication.class, args);
		
		
	}

}
