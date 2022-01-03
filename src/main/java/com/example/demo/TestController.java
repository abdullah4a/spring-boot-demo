package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
//TODO path to the test
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public String get(){
        return "Hello world";
    }

    @GetMapping("/list")
    public List<String> getAll(){
        return Collections.singletonList("Hello world");
    }

    @PostMapping("/")
    public List<String> getAll(@RequestBody String string){
        return List.of("Hello world", string);
    }

}
