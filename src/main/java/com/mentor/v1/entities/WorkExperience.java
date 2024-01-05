package com.mentor.v1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;
@Getter
@Setter
@Entity(name = "WorkExperience")
@Table(name = "workexperience")
@NoArgsConstructor
@AllArgsConstructor
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "is_current")
    private short isCurrent;

    @Column(name = "startdate")
    private Timestamp startDate;

    @Column(name = "enddate")
    private Timestamp endDate;

    @OneToOne
    @JoinColumn(name = "jobtitle_id", referencedColumnName = "id")
    private LookupJobTitle lookupJobTitle;

    @ManyToOne
    @JoinColumn(name = "mentor_id" ,referencedColumnName = "id")
    @JsonIgnore
    private Mentor mentor;


}
