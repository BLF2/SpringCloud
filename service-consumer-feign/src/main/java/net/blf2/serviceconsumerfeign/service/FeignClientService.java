package net.blf2.serviceconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(value = "SERVICE-PROVIDER")
public interface FeignClientService {

    @GetMapping("/hello/hi")
    Map<String,Object> hello();
}
