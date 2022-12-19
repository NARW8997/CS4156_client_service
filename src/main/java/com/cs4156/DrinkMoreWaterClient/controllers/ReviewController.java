package com.cs4156.DrinkMoreWaterClient.controllers;


import com.cs4156.DrinkMoreWaterClient.controllers.utils.R;
import com.cs4156.DrinkMoreWaterClient.models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("http://cs4156project-env.eba-hpiqqrju.us-east-1.elasticbeanstalk.com/4/review")
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

    @GetMapping("/user/{id}")
    public R getUserRestReviewByUserId(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl + "/user/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/rest/{id}")
    public R getUserRestReviewByRestId(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl + "/rest/" + id, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @PostMapping
    public R insert(@RequestBody Review review) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        review.setUserId(4);
        HttpEntity<Object> entity = new HttpEntity<>(review, headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl,
                HttpMethod.POST, entity, R.class);
        return exchange.getBody();
    }

    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(baseUrl + "/" + id, HttpMethod.DELETE, entity, R.class);
        return exchange.getBody();
    }
}
