package com.cs4156.DrinkMoreWaterClient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cs4156.DrinkMoreWaterClient.mapper")
public class DrinkMoreWaterClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkMoreWaterClientApplication.class, args);
	}

}
