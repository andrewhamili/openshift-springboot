package com.andrewhamili.openshiftdemo;

import com.andrewhamili.openshiftdemo.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DefaultController {

    @GetMapping("/")
    public ResponseEntity<ApiResponse> landing(){
        return new ResponseEntity<>(new ApiResponse("It works"), HttpStatus.OK);
    }

}
