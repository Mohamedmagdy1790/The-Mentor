package com.mentor.v1.services;




        import java.sql.Timestamp;
        import java.time.ZoneId;
        import java.time.ZonedDateTime;
        import java.util.List;
        import java.util.TimeZone;

        import com.mentor.v1.entities.Mentor;
        import com.mentor.v1.repositories.MentorRepository;
        import org.springframework.stereotype.Service;

@Service

public class MentorService {

    private final MentorRepository mentorRepository;

    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public void saveMentorInUTC() {
        TimeZone.setDefault(TimeZone.getTimeZone("Egypt/cairo"));

        Mentor mentor = new Mentor();

        mentor.setFirstName("sahar");
        mentor.setLastName("karam");
        mentor.setBirthDate(new Timestamp(
                ZonedDateTime.of(2007, 3, 7, 10, 17, 55, 0, ZoneId.of("UTC"))
                        .toInstant().toEpochMilli()
        ));
        System.out.println("Timestamp epoch milliseconds before insert: "
                + mentor.getBirthDate().getTime());

        mentorRepository.save(mentor);
    }

    public Mentor displayMentorBirthdateInUTC(String name) {
        Mentor fetchMentor= mentorRepository.findByFirstName(name);
        System.out.println("Timestamp epoch milliseconds after fetching: "
                + fetchMentor.getBirthDate().getTime());
        return fetchMentor;
    }

    public List<Mentor> getMentorsByJopTilte(String name) {
        List<Mentor> fetchMentors= mentorRepository.getMentors(name);

        return fetchMentors;
    }
}