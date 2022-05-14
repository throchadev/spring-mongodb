package com.example.springmongodb;

import com.example.springmongodb.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongodbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

	@Autowired
	private FilmeService filmeService;

	@Override
	public void run(String... args) throws Exception {

		this.filmeService.save("Os Vingadores", "2012");
		System.out.println("Filme salvo com sucesso!!");
	}

}
