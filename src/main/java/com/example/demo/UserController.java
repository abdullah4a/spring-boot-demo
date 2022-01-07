package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
//TODO path to the test
@RequestMapping("/user")
public class UserController {
    private UserModel userModel;

    @GetMapping("/list")
    public List<UserModel> get() {
        return Collections.singletonList(new UserModel(1L,
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
                new AddressModel(2980L,
                        "street",
                        "USA",
                        "California",
                        "ABC"
                )));
    }

    @PostMapping("/")
    public UserModel post(@RequestBody UserModel model) {
        return model;
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        UserModel model = null;
        try {
            if (model != null) {
                return Objects.equals(webId, model.getWebId());
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("User Id Not Found", exc);
        }
        return false;
    }

    @PutMapping("/{id}")
    public UserModel update(@PathVariable("id") Long webId, @RequestBody UserModel model) {
        UserModel userModel = null;
        try {
            assert userModel != null;
            if (Objects.equals(webId, userModel.getWebId())) {
//                TODO Updating will go here
                return model;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("User Id Not Found", exc);
        }
        return null;
    }

    @GetMapping("/{id}")
    public UserModel getById(@PathVariable("id") Long webId) {
        UserModel model = null;
        try {
            assert model != null;
            if (Objects.equals(webId, model.getWebId())) {
                return new UserModel(1L,
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
                        new AddressModel(2980L,
                                "street",
                                "USA",
                                "California",
                                "ABC"
                        ));
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("User Id Not Found", exc);
        }
        return null;

    }
}
