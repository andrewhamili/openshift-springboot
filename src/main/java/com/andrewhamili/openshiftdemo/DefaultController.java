package com.andrewhamili.openshiftdemo;

import com.andrewhamili.openshiftdemo.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class DefaultController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private Runtime runtime;

    @PostConstruct
    public void init(){
        runtime = Runtime.getRuntime();
    }

    @GetMapping("/")
    public ResponseEntity<ApiResponse> landing(){
        log.info("landing");
        log.info(String.valueOf(runtime.freeMemory()));
        log.info(String.valueOf(runtime.totalMemory()));
        return new ResponseEntity<>(new ApiResponse(String.valueOf(runtime.freeMemory())), HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<ApiResponse> test(){
        log.info("test");
        return landing();
    }

}
