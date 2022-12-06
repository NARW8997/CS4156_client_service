package com.cs4156.DrinkMoreWaterClient.controllers;

import com.cs4156.DrinkMoreWaterClient.controllers.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration
@RequestMapping("/dish")
public class DishController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public R getAll() {
        String url = "http://localhost:8080/4/dish";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/dish";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }
}
