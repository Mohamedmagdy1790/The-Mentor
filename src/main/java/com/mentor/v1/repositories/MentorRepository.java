package com.mentor.v1.repositories;

import com.mentor.v1.entities.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    @Transactional(readOnly=true)
    public Mentor findByFirstName(String name);

    @Query(value = "SELECT m FROM Mentor m " +
            "JOIN WorkExperience w ON m.id=w.mentor.id " +
            "JOIN LookupJobTitle ljt on  w.lookupJobTitle.id= ljt.id WHERE ljt.jobTitle = :name")
   public List<Mentor> getMentors(String name);

}

