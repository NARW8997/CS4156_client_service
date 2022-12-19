package com.cs4156.DrinkMoreWaterClient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@SpringBootApplication
public class DrinkMoreWaterClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkMoreWaterClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(ClientHttpRequestFactory factory){
		RestTemplate restTemplate= new RestTemplate(factory);
		restTemplate.getMessageConverters().set(1,
				new StringHttpMessageConverter(Charset.forName("UTF-8")));
		return restTemplate;
	}

	@Bean
	public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setReadTimeout(5000); //ms
		factory.setConnectTimeout(5000); //ms
		return factory;
	}
}
