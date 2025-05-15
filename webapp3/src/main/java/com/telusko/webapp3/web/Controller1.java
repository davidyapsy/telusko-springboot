package com.telusko.webapp3.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.webapp3.model.Course;

@Controller
public class Controller1 {
	
	//Query Param
	@GetMapping("/admin")
	public String verifyLogin(@RequestParam("id")String id, @RequestParam("pwd")String pwd, Model model) {
		if(id.equals("david") && pwd.equals("david")) {
			model.addAttribute("name", "David");
			return "success";
		}else {
			return "failed";
		}
	}
	
	//PathParam
	@GetMapping("/course-info/{name}")
	public String getCourseDetails(@PathVariable("name")String name, Model model) {
		Course course  = new Course(1, name, 2024);
		model.addAttribute("name", name);
		model.addAttribute("result", course);
		return "course";
	}
	
	
}
