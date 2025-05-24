package com.telusko.TouristBackend.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.TouristBackend.model.Tourist;
import com.telusko.TouristBackend.service.ITouristService;

@WebMvcTest(TouristController.class)
public class TouristControllerTest {
	
	@MockBean
	private ITouristService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void getAllTouristTest() throws Exception {
		//mockito
		Mockito.when(service.getAllTourist()).thenReturn(new ArrayList<>());

		//mock request
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/get-all-tourist");
		ResultActions result = mockMvc.perform(requestBuilder);
		MvcResult mvcReturn = result.andReturn();
		int statusCode = mvcReturn.getResponse().getStatus();
		
		//assert
		assertEquals(200, statusCode);
	}
	
	@Test
	void addTouristTest() throws Exception {
		//mockito
		Mockito.when(service.addTourist(ArgumentMatchers.any())).thenReturn("Test");

		Tourist tourist = new Tourist(1, "David", 20, "Diamond", "City", 200.00);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(tourist);
		//mock request
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/add-new-tourist")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json);
		ResultActions result = mockMvc.perform(requestBuilder);
		MvcResult mvcReturn = result.andReturn();
		int statusCode = mvcReturn.getResponse().getStatus();
		
		//assert
		assertEquals(201, statusCode);
	}
}
