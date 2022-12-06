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
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public R getAll() {
        String url = "http://localhost:8080/4/restaurant";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/restaurant";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/details")
    public R getAllRestDetails() {
        String url = "http://localhost:8080/4/restaurant";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/details", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}/details")
    // admin, user, uber eats, rest
    public R getRestDetailsById(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/restaurant";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id + "/details", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}/like")
    public R updateRestLikesByRestIdBy1(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/restaurant";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id + "/like", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}/dislike")
    // admin, user
    public R updateRestDislikesByRestIdBy1(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/restaurant";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id + "/dislike", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/popular")
    public R getPopularRestaurants() {
        String url = "http://localhost:8080/4/restaurant";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/popular", HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }



}
