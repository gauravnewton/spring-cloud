package com.tech.reloded;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class SpringCloudConfigProviderApplication.
 */
@SpringBootApplication
@RestController
@RequestMapping("infy")
public class SpringCloudConfigProviderApplication {

	/**
	 * Gets the almuni.
	 *
	 * @return the almuni
	 */
	@GetMapping("/getInfyAlmuni")
	public List<String> getAlmuni() {
		return Stream.of("Gaurav Kumar", "Sayan paul", "Smruti Behera").collect(Collectors.toList());
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigProviderApplication.class, args);
	}

}
