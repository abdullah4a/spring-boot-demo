package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController

@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/list")
    public List<CategoryModel> getAll() {
        return Collections.singletonList(new CategoryModel(
                1l,
                "3213",
                "TEST",
                "MODEL"));
    }

    //Trying New Methods
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CategoryModel getById(@PathVariable("id") Long webId) {
        CategoryModel model = null;
       try
       {
           if (webId==model.getWebId()){
               return new CategoryModel(webId,
                       "3213",
                       "TEST",
                       "MODEL");
           }
       }catch (ExceptionHandler exc) {
           throw new ExceptionHandler(
                   "Foo Not Found", exc);
       }
       return null;
    }

    @PostMapping("/")
    public CategoryModel post(@RequestBody CategoryModel model) {
        return model;
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        return true;
    }

    @PutMapping("/{id}")
    public CategoryModel update(@PathVariable("id") Long webId, @RequestBody CategoryModel model) {
        return model;
    }
}
