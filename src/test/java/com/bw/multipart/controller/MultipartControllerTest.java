package com.bw.multipart.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/application-context.xml",
	"file:src/main/webapp/WEB-INF/spring/dispatcher-servlet.xml"})
@WebAppConfiguration
public class MultipartControllerTest {
	private MockMvc mockMvc;

	private InternalResourceViewResolver resolver;

	@InjectMocks
	private MultipartController multipartController;

	@Before
	public void setUp() throws Exception {
		resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");

		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(multipartController).setViewResolvers(resolver).build();
	}

	@After
	public void tearDown() throws Exception {}

	@Test
	public void testGetMultiPartPage() throws Exception {
		// Given
		// When
		// Then
		mockMvc.perform(get("/multipart")).andExpect(status().isOk());
	}

	@Test
	public void testGetUploadPage() throws Exception {
		// Given
		// When
		// Then
		mockMvc.perform(get("/multipart/upload")).andExpect(status().isOk());
	}

}
