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
import com.example.datajpa04.view.ResultView1;
import com.example.datajpa04.view.ResultView2;

@SpringBootApplication
public class Datajpa06Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Datajpa06Application.class, args);
		FurnitureService fs = container.getBean(FurnitureService.class);
		fs.searchByManuYearGreaterThan(2020, ResultView2.class).
		forEach(v->System.out.println(v.getManuYear()+" "+v.getName()));
	}

}
