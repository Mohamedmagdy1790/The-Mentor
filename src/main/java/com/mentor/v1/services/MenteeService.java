package com.mentor.v1.services;

import com.mentor.v1.entities.Mentee;
import com.mentor.v1.entities.Mentor;
import com.mentor.v1.repositories.MenteeRepository;
import com.mentor.v1.repositories.MentorRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.TimeZone;

@Service
public class MenteeService {
    private final MenteeRepository menteeRepository;

    public MenteeService( MenteeRepository menteeRepository) {
        this.menteeRepository = menteeRepository;
    }


    public Mentee displayMentorBirthdateInUTC(String name) {
        Mentee fetchMentee= menteeRepository.findMenteeByFirstName(name) ;
        System.out.println("Timestamp epoch milliseconds after fetching: "
                + fetchMentee.getBirthDate().getTime());
        return fetchMentee;
    }

    public List<Mentee> getAll(String name) {
        List<Mentee> fetchMentees= menteeRepository.findAll();

        return fetchMentees;
    }
}
