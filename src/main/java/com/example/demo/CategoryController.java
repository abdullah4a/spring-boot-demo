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
        CategoryModel model=null;
        try {
            if (webId == model.getWebId()) {
                return new CategoryModel(model.getWebId(),
                        "3654", "TEST CATEGORY", "TEST SUBCATEGORY");
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Category Id Not Found", exc);
        }
        return null;
    }

    @PostMapping("/")
    public CategoryModel post(@RequestBody CategoryModel model) {
        return model;
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        CategoryModel model = null;
        try {
            if (webId == model.getWebId()) {
                return true;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Category Id Not Found", exc);
        }
        return false;
    }

    @PutMapping("/{id}")
    public CategoryModel update(@PathVariable("id") Long webId, @RequestBody CategoryModel model) {
        CategoryModel categoryModel = null;
        try {
            if (webId == categoryModel.getWebId()) {
//                TODO Updating the Model remaining
                return model;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Category Id Not Found", exc);
        }
        return null;
    }
}
