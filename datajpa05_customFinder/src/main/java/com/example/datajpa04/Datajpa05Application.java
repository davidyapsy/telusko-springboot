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
public class Datajpa05Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Datajpa05Application.class, args);
		FurnitureService fs = container.getBean(FurnitureService.class);
//		fs.searchByManuYear(2020).forEach(v->System.out.println(v.getManuYear()+" "+v.getId()));
//		fs.searchByNameStartingWith("c").forEach(System.out::println);
//		fs.searchByNameStartingWithAndManuYearBetween("c", 2020, 2022).forEach(System.out::println);
		fs.searchByManuYearCustom(2020).forEach(System.out::println);
	}

}
