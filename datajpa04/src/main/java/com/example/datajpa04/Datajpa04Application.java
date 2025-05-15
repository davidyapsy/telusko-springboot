package com.example.datajpa04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.datajpa04.model.Furniture;
import com.example.datajpa04.service.FurnitureService;

// Paging & sorting, CRUD repo
@SpringBootApplication
public class Datajpa04Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Datajpa04Application.class, args);
		FurnitureService fs = container.getBean(FurnitureService.class);
		fs.getAll(true, "manuYear").forEach(System.out::println);
//		System.out.println(fs.getRefById(1));
		
//		List<Integer> intList = Arrays.asList(1,2);
//		System.out.println(fs.removeByIds(intList));
		
//		List<Furniture> furList = new ArrayList<>();
//		furList.add(new Furniture("chair", 2020));
//		furList.add(new Furniture("table", 2022));
//		fs.saveFurnitures(furList);
		
		
	}

}
