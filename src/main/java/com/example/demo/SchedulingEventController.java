package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController

@RequestMapping("/schedule/event")
public class SchedulingEventController {
    @PostMapping("/")
    public SchedulingEventModel post(@RequestBody SchedulingEventModel model) {
        return model;
    }

    @GetMapping("/list")
    public List<SchedulingEventModel> getAll() {
        return Collections.singletonList(new SchedulingEventModel(1l,
                "New event",
                "333",
                "TEST",
                new Date(),
                false,
                false,
                "TEST",
                "",
                "",
                new Date(),
                1l,
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST"));
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long webId) {
        return true;
    }

    @PutMapping("/{id}")
    public SchedulingEventModel Update(@PathVariable("id") Long webId, @RequestBody SchedulingEventModel model) {
        return model;
    }

    @GetMapping("/{id}")
    public SchedulingEventModel getById(@PathVariable("id") Long webId) {
        return new SchedulingEventModel(
                1l,
                "New event",
                "333",
                "TEST",
                new Date(),
                false,
                false,
                "TEST",
                "TEST",
                "TEST",
                new Date(),
                1l,
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST");
    }
}
