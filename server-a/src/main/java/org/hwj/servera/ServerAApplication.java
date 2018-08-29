package org.hwj.servera;

import org.hwj.servera.feign.ServerBApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableCircuitBreaker
@EnableHystrix
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
	ServerBApi serverBApi;

	@RequestMapping(value = "/hi-feign")
	public String hiFeign(){
		return serverBApi.hi() + " , caller a";
	}
}
