package com.cs4156.DrinkMoreWaterClient.controllers;


import com.cs4156.DrinkMoreWaterClient.controllers.utils.R;
import com.cs4156.DrinkMoreWaterClient.models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public R getAll() {
        String url = "http://localhost:8080/4/review";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/review";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/user/{id}")
    public R getUserRestReviewByUserId(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/review";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/user/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/rest/{id}")
    public R getUserRestReviewByRestId(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/review";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/rest/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @PostMapping
    public R insert(@RequestBody Review review) {
        String url = "http://localhost:8080/4/review";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        review.setUserId(4);
        HttpEntity<Object> entity = new HttpEntity<>(review, headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url,
                HttpMethod.POST, entity, R.class);
        return exchange.getBody();
    }

    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/review";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id, HttpMethod.DELETE, entity, R.class);
        return exchange.getBody();
    }
}
