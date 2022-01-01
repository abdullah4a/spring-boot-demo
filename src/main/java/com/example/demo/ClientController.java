package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController

@RequestMapping("/client")
public class ClientController {
    @PostMapping("/")
    public ClientModel post(@RequestBody ClientModel model) {
        return model;
    }

    @GetMapping("/list")
    public List<ClientModel> getAll() {
        return Collections.singletonList(new ClientModel(1l,
                "Test",
                "654654",
                "TEST",
                "Model",
                "Model for TEST",
                "TEST@test.com",
                "NONE",
                "+6465421",
                "testBranch.com",
                new Date(),
                true,
                new AddressModel(2980l,
                        "street",
                        "USA",
                        "California",
                        "ABC"
                )));
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        return true;
    }

    @PutMapping("/{id}")
    public ClientModel update(@PathVariable("id") Long webId, @RequestBody ClientModel model) {
        return model;
    }

    @GetMapping("/{id}")
    public ClientModel getById(@PathVariable("id") Long webId) {
        return new ClientModel(
                1l,
                "Test",
                "654654",
                "TEST",
                "Model",
                "Model for TEST",
                "TEST@test.com",
                "NONE",
                "+6465421",
                "testBranch.com",
                new Date(),
                true,
                new AddressModel(2980l,
                        "street",
                        "USA",
                        "California",
                        "ABC"
                ));
    }
}
