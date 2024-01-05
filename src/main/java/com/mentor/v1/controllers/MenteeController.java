package com.mentor.v1.controllers;

import com.mentor.v1.entities.Mentee;
import com.mentor.v1.services.MenteeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menteeName")
public class MenteeController {

    MenteeService menteeService;

    public MenteeController(MenteeService menteeService) {
        this.menteeService=menteeService;
    }

    @GetMapping("/{menteeName}")
    Mentee getMentee( @PathVariable String menteeName){
        return menteeService.displayMentorBirthdateInUTC(menteeName);
    }
}
