package com.mentor.v1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "mentoring_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MentoringRequests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "support_desc")
    private String SupportDesc;

    @Column(name = "request_date")
    private Timestamp RequestDate;

    @Column(name = "no_of_hours")
    private int noOfHours;

    @Column(name = "skill_id")
    private String skillId;


    @ManyToOne
    @JoinColumn(name = "mentee_id" ,referencedColumnName = "id")
    @JsonIgnore
    private Mentee mentee;

}
