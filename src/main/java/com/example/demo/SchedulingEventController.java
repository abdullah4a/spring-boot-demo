package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController

@RequestMapping("/schedule/event")
public class SchedulingEventController {
    @PostMapping("/")
    public SchedulingEventModel postNonRecurring(@RequestBody SchedulingEventModel model) {
        return model;
    }

    @GetMapping("/list")
    public List<SchedulingEventModel> getAllNonRecurring() {
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
    public Boolean deleteNonRecurring(@PathVariable("id") Long webId) {
        SchedulingEventModel model = null;
        try {
            if (webId == model.getWebId()) {
                return true;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Appointment Id Not Found", exc);
        }
        return false;
    }

    @PutMapping("/{id}")
    public SchedulingEventModel updateNonRecurring(@PathVariable("id") Long webId, @RequestBody SchedulingEventModel model) {
        SchedulingEventModel schedulingEventModel = null;
        try {
            if (webId == schedulingEventModel.getWebId()) {
                return model;
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Appointment Id Not Found", exc);
        }
        return null;
    }

    @GetMapping("/{id}")
    public SchedulingEventModel getByIdNonRecurring(@PathVariable("id") Long webId) {
        SchedulingEventModel model = null;
        try {
            if (webId == model.getWebId()) {
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
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Appointment Id Not Found", exc);
        }
        return null;
    }
//    @GetMapping("/recurrence/list")
//    public List<SchedulingEventModel> getAllRecurring() {
//        return Collections.singletonList(new SchedulingEventModel(1l,
//                "New event",
//                "333",
//                "TEST",
//                new Date(),
//                false,
//                true,
//                "TEST",
//                "",
//                "",
//                new Date(),
//                1l,
//                "TEST",
//                "TEST",
//                "TEST",
//                "TEST",
//                "TEST",
//                "TEST",
//                new SchedulingRecurrenceEventModel(
//                        1l,
//                        new String[]{""},
//                        "",
//                        1l,
//                        true,
//                        new Long[]{1l},
//                        1l,
//                        "",
//                        new Date(),
//                        new Date()
//                )
//        ));
//    }
}

