package com.ranjan.jenkinsCiCdApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest
class JenkinsCiCdApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGreetingsEndpoint() throws Exception{
		String name = "Priyaranjan Kumar";

		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello "+name +" Congratulations you for successfully completed Jenkins CI/CD demo !"));
	}

}
