package net.blf2.serviceconsumerfeign.controller;

import net.blf2.serviceconsumerfeign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/feign")
public class HomeController {

    @Autowired
    private FeignClientService feignClientService;

    @GetMapping("/test")
    public Map<String,Object> testFeign(){

        return feignClientService.hello();
    }
}
