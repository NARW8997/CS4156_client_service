package com.cs4156.DrinkMoreWaterClient.controllers;

import com.cs4156.DrinkMoreWaterClient.controllers.utils.R;
import com.cs4156.DrinkMoreWaterClient.models.Bookmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration
@RequestMapping("/bookmark")
public class BookMarkController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/{userId}")
    public R getByUserId(@PathVariable Integer userId) {
        String url = "http://localhost:8080/4/bookmark/user/4";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

    @GetMapping("/countuser/{userId}")
    public R countByUserId(@PathVariable Integer userId) {
        String url = "http://localhost:8080/4/bookmark/countuser/4";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, R.class);
        return exchange.getBody();
    }

//    @GetMapping("/countrest/{restId}")
//    public R countByRestId(@PathVariable Integer restId) {
//        String url = "http://localhost:8080/4/bookmark/countrest";
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<Object> entity = new HttpEntity<>(headers);
//        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" +restId, HttpMethod.GET, entity, R.class);
//        return exchange.getBody();
//    }

    @PostMapping
    public R insert(@RequestBody Bookmark mark) {
        String url = "http://localhost:8080/4/bookmark";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        mark.setUserId(4);
        HttpEntity<Object> entity = new HttpEntity<>(mark, headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url,
                HttpMethod.POST, entity, R.class);
        return exchange.getBody();
    }

    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id) {
        String url = "http://localhost:8080/4/bookmark";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<R> exchange = restTemplate.exchange(url + "/" + id, HttpMethod.DELETE, entity, R.class);
        return exchange.getBody();
    }
}
