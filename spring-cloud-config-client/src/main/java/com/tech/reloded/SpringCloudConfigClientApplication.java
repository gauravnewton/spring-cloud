package com.tech.reloded;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloudConfigClientApplication {
	
	@Autowired
	@Lazy
	private RestTemplate template;
	
	@Value("${infy.almuni.provider}")
	private String url;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}
	
	@GetMapping("/getInfyAlmuni")
	public List<String> getAlmuni(){
		return template.getForObject(url, List.class);
	}

	@Bean
	public RestTemplate  restTemplate() {
		return new RestTemplate();
	}
}
