package com.andrewhamili.openshiftdemo;

import com.andrewhamili.openshiftdemo.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DefaultController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public ResponseEntity<ApiResponse> landing(){
        log.info("landing");
        return new ResponseEntity<>(new ApiResponse("It works"), HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<ApiResponse> test(){
        log.info("test");
        return landing();
    }

}
