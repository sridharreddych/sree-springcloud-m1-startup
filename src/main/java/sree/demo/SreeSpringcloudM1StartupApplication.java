package sree.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SreeSpringcloudM1StartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SreeSpringcloudM1StartupApplication.class, args);
	}

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello from SpringBoot APP" ;
	}
}
