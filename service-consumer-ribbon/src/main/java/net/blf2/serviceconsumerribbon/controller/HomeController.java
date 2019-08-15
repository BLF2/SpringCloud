package net.blf2.serviceconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/ribbon")
public class HomeController {

    public static final String URL = "http://SERVICE-PROVIDER/hello/hi";


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public Map<String,Object> testRibbon(){

        return restTemplate.getForObject(URL,Map.class);
    }
}
