package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController

@RequestMapping("/branch")
public class BranchController {
    @PostMapping("/")
    public BranchModel post(@RequestBody BranchModel model) {
        return model;
    }

    @GetMapping("/list")
    public List<BranchModel> getAll() {
        return Collections.singletonList(new BranchModel(1l,
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
                )));
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        BranchModel model=null;
        try {
            if (webId == model.getWebId()) {
                return true;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Branch Id Not Found", exc);
        }
        return false;
    }

    @GetMapping("/{id}")
    public BranchModel getById(@PathVariable("id") Long webId) {
        BranchModel model=null;
        try {
            if (webId == model.getWebId()) {
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
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Branch Id Not Found", exc);
        }
        return null;
    }

    @PutMapping("/{id}")
    public BranchModel update(@PathVariable("id") Long webId, @RequestBody BranchModel model) {
        BranchModel branchModel=null;
        try {
            if (webId == model.getWebId()) {
//                TODO updating of branch left
                return model;

            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Branch Id Not Found", exc);
        }
        return null;
    }
}
