package com.mentor.v1.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Mentor")
@Table(name = "mentor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "birthdate")
    private Timestamp birthDate;

    @Email
    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone", unique = true)
    private String phone;

    @Column(name = "linkedin_url")
    private String linkedinURL;

    @Column(name = "hourly_price")
    private String hourlyPrice;

    @OneToOne
    @JoinColumn(name = "location_country_id" , referencedColumnName = "id")
    private LookupCountry lookupCountry;


    @OneToMany(mappedBy = "mentor", fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    List<WorkExperience> workExperienceList =new ArrayList<>();


}
