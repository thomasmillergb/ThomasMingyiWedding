package com.thomasmillergb.thomasMingyiWeddingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ThomasMingyiWeddingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ThomasMingyiWeddingApplication.class, args);
		/*String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}*/
	}
}
