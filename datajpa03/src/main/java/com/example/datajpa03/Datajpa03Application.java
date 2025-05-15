package com.example.datajpa03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.datajpa03.model.Furniture;
import com.example.datajpa03.service.FurnitureService;

// Paging & sorting, CRUD repo
@SpringBootApplication
public class Datajpa03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Datajpa03Application.class, args);
		FurnitureService fs = container.getBean(FurnitureService.class);
//		List<Furniture> furnitureList = new ArrayList<>();
//		furnitureList.add(new Furniture("chair", 2020));
//		furnitureList.add(new Furniture("table", 2022));
//		furnitureList.add(new Furniture("bed", 2021));
//		furnitureList.add(new Furniture("clock", 2024));
		
		//fs.saveFurnitures(furnitureList).forEach(System.out::println);
		//fs.getAll(false, "name", "manuYear").forEach(System.out::println);
		fs.getAll(2, false, "id");
	}

}
