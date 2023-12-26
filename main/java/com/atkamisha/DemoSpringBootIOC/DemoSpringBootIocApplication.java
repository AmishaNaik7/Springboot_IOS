package com.atkamisha.DemoSpringBootIOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.TKAamisha")//com.jbk // com.tka
public class DemoSpringBootIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootIocApplication.class, args);
		System.out.println("SpringBoot IOC............");
	}

}
