package com.mentor.v1.repositories;

import com.mentor.v1.entities.Mentee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenteeRepository  extends JpaRepository<Mentee, Integer> {
    Mentee findMenteeByFirstName(String name);

}
