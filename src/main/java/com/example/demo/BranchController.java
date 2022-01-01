package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController

@RequestMapping("/branch")
public class BranchController {

    @GetMapping("/list")
    public BranchModel get(){
        return new BranchModel(1l,
                "Test",
                "Model",
                "3213121",
                "+6465421",
                "TEST BRANCH HELD HERE",
                "TEST @ TEST.COM",
                "testBranch.com",
                "+9265146",
                true,
                new AddressModel(2980l,
                        "street",
                        "USA",
                        "California",
                        "ABC"
                ));
    }


    public List<String> getAll(){
        return Collections.singletonList("Hello world");
    }

    @PostMapping("/")
    public List<String> getAll(@RequestBody String string){
        return List.of("Hello world", string);
    }


}