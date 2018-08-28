package org.hwj.monitorserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class MonitorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorServerApplication.class, args);
	}
}
