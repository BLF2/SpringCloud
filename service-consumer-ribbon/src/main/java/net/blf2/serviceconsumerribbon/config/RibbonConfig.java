package net.blf2.serviceconsumerribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate ribbonRestTemplate(){

        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){

        return new RetryRule();
    }
}
