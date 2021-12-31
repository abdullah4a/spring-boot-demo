package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
//TODO path to the test
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public UserModel get(){
        return new UserModel(1l,
                "Test",
                "Model",
                "9898",
                "TEST MODEL",
                "Hair Stylisy",
                "Public@email.com",
                "California",
                "N/A",
                "+92",
                "Male",
                new Date(),
                new AddressModel(2980l,
                        "street",
                        "USA",
                        "California",
                        "ABC"
                        ));
    }

    @PostMapping("/")
    public List<String> getAll(@RequestBody String string){
        return List.of("Hello world", string);
    }


}
