package org.jlobato.gpro.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class GproApiProxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(GproApiProxyApplication.class, args);
		log.info("GPRO Api Proxy is UP!!!");
	}    
}
