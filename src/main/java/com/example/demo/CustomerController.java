package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController

@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/list")
    public List<CustomerModel> getAll() {
        return Collections.singletonList(new CustomerModel(1l,
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
                )));
    }


    @PostMapping("/")
    public CustomerModel post(@RequestBody CustomerModel model) {
        return model;
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        CustomerModel model=null;
        try {
            if (webId == model.getWebId()) {
                return true;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Customer Id Not Found", exc);
        }
        return false;
    }

    @PutMapping("/{id}")
    public CustomerModel update(@PathVariable("id") Long webId, @RequestBody CustomerModel model) {
        CustomerModel customerModel=null;
        try {
            if (webId == customerModel.getWebId()) {
//                TODO updating of model will go here
                return model;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Customer Id Not Found", exc);
        }
        return null;
    }

    @GetMapping("/{id}")
    public CustomerModel getById(@PathVariable("id") Long webId) {
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
    };
}
