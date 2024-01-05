package com.mentor.v1.controllers;


import com.mentor.v1.entities.Mentor;
import com.mentor.v1.services.MentorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mentor")
public class MentorController {
     MentorService mentorService;
     MentorController(MentorService mentorService) {
         this.mentorService=mentorService;
     }


    @GetMapping("/{name}")
    Mentor getmentor(@PathVariable String name){
       return mentorService.displayMentorBirthdateInUTC(name);
    }

    @GetMapping("/mentors/{name}")
    List<Mentor> getmentorsbyjobtitle(@PathVariable String name){
        return mentorService.getMentorsByJopTilte(name);
    }



}
