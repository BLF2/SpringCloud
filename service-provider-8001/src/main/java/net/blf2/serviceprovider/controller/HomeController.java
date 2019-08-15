package net.blf2.serviceprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HomeController {

    @GetMapping("/hi")
    public Map<String,String> hello(){

        return new HashMap<String,String>(){{
            put("code","000000");
            put("msg","Hello World-8001");
        }};
    }
}
