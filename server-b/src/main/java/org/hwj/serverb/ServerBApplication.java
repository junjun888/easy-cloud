package org.hwj.serverb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ServerBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerBApplication.class, args);
	}

	@RequestMapping(value = "/hi")
	public String hi(){
		return "helle i am server b";
	}
}
