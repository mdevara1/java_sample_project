package com.example.Jenkins_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/serviceA")
public class serviceA {

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping("/postB")
    public ResponseEntity<String> HelloB(@RequestBody helloModal helloB){
        String url = "http://backend-serviceb-kube.default.svc.cluster.local:81/serviceB/hello";
        ResponseEntity<String> response =  restTemplate.postForEntity(url,helloB, String.class);
        return response;
    }

}
