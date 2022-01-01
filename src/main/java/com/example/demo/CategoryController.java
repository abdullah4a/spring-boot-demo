package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController

@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/list")
    public List<CategoryModel> getAll(){
        return Collections.singletonList(new CategoryModel(
                1l,
                "3213",
                "TEST",
                "MODEL"));
    }
    @PostMapping("/")
    public CategoryModel post(@RequestBody CategoryModel model){
        return model;
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        return true;
    }
}
