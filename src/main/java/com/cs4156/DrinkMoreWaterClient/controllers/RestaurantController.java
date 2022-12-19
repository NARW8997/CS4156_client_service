package com.cs4156.DrinkMoreWaterClient.controllers;


import com.cs4156.DrinkMoreWaterClient.controllers.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@EnableAutoConfiguration
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("http://cs4156project-env.eba-hpiqqrju.us-east-1.elasticbeanstalk.com/4/restaurant")
    private String baseUrl;

    @GetMapping
    public R getAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl + "/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/details")
    public R getAllRestDetails() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl + "/details", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}/details")
    // admin, user, uber eats, rest
    public R getRestDetailsById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl + "/" + id + "/details", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/popular")
    public R getPopularRestaurants() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl + "/popular", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }
}
