package com.gotravel.zuulapigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayServiceApplication.class, args);
	}

}
