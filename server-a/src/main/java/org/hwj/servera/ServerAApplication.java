package org.hwj.servera;

import org.hwj.servera.feign.ServerBAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@EnableEurekaClient
@RestController
@SpringBootApplication
public class ServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAApplication.class, args);
	}

	@RequestMapping(value = "/hi")
	public String hi(){
		return "helle i am server a";
	}

	@Autowired
	ServerBAPI serverBAPI;

	@RequestMapping(value = "/hi-feign")
	public String hiFeign(){
		return serverBAPI.hi() + " , caller b";
	}
}
