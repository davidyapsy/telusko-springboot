package jacksonapi1.main;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jacksonapi1.model.Student;

public class LaunchApp1 {
	public static void main(String[] args) throws IOException {
		
//		Student stud1 = new Student(1, "davi1", 21);
//		Student stud2 = new Student(2, "davi2", 22);
//		Student stud3 = new Student(3, "davi3");
//		List<Student> studList = Arrays.asList(stud1, stud2, stud3);
//		
//		ObjectMapper mapper = new ObjectMapper();
//		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(studList);
//		System.out.println(json);
		
		ObjectMapper mapper = new ObjectMapper();
		Student stud = mapper.readValue(new File("json/sample.json"), Student.class);
		System.out.println(stud);
		
	}
}
