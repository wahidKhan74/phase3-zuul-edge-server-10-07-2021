package com.simplilearn.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Phase3ZuulEdgeServer10072021Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3ZuulEdgeServer10072021Application.class, args);
	}

}
