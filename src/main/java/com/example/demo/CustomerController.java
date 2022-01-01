package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController

@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/list")
    public CustomerModel get(){
        return new CustomerModel(1l,
                "TestModel",
                "3213121",
                "Test",
                "Model",
                new Date(),
                "TEST @ TEST.COM",
                "Male",
                "+9265146",
                true,
                new AddressModel(2980l,
                        "street",
                        "USA",
                        "California",
                        "ABC"
                ));
    }


    @PostMapping("/")
    public CustomerModel post(@RequestBody CustomerModel model){
        return model;
    }



}
