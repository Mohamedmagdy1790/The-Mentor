 CREATE TABLE lookup_country
(
    id integer primary key,
    countryname varchar unique
);

CREATE TABLE lookup_skills
(
    id integer primary key,
    skillname varchar unique
);

CREATE TABLE lookup_jobtitle
(
    id integer primary key,
    jobtitle varchar unique
);

CREATE TABLE lookup_mentoring_request_status
(
    id integer primary key,
    request_status varchar unique
);

CREATE TABLE mentor
(
    id integer primary key,
    firstname varchar ,
    lastname varchar,
    birthdate date,
    phone varchar unique,
    email varchar unique,
    linkedin_url varchar,
    hourly_price decimal,
    location_country_id int,
    CONSTRAINT fk_mentor_country
        FOREIGN KEY(location_country_id)
            REFERENCES lookup_country(id)

);

CREATE TABLE workexperience
(
    id integer primary key,
    company_name varchar,
    startdate date not null,
    enddate date,
    jobtitle_id integer,
    is_current boolean,
    mentor_id integer,
    CONSTRAINT fk_mentor
        FOREIGN KEY(mentor_id)
            REFERENCES mentor(id),

    CONSTRAINT fk_jobtitle
        FOREIGN KEY(jobtitle_id)
            REFERENCES lookup_jobtitle(id)

);

CREATE TABLE mentor_skills
(
    mentor_id    integer ,
    skill_id     integer ,
    num_of_years integer ,
    CONSTRAINT mentor_skills_pkey PRIMARY KEY (mentor_id, skill_id),
    CONSTRAINT fk_mentor
        FOREIGN KEY(mentor_id)
            REFERENCES mentor(id),
    CONSTRAINT fk_skill
        FOREIGN KEY(skill_id)
            REFERENCES lookup_skills(id)
);


CREATE TABLE mentee
(
    id integer primary key,
    firstname varchar ,
    lastname varchar,
    birthdate date,
    phone varchar,
    email varchar
);

CREATE TABLE mentoring_requests
(
    id integer primary key,
    request_date date,
    skill_id int ,
    support_desc varchar,
    mentee_id int,
    no_of_hours int,
    CONSTRAINT fk_mentee
        FOREIGN KEY(mentee_id)
            REFERENCES mentee(id)
);

CREATE TABLE mentoring_offers
(
    id integer primary key,
    mentoring_request_id int ,
    mentor_id int,
    discount_rate int,
    offer_message varchar (200),
    request_status_id int,
    CONSTRAINT fk_request_status
        FOREIGN KEY(request_status_id)
            REFERENCES lookup_mentoring_request_status(id)

);


insert into lookup_country (id, countryname) values (1, 'Egypt');
insert into lookup_country (id, countryname) values (2, 'Singapore');
insert into lookup_country (id, countryname) values (3, 'Japan');
insert into lookup_country (id, countryname) values (4, 'UK');
insert into mentor values (1,'Samy', 'Gad', '2022-10-13','01007787781','samy.it@gmail.com','mylinkedinURL', 200, 1);
insert into mentor values (2,'Shady', 'Eid', '1988-08-10','01118269777','shady.eid@gmail.com','linkedlinked', 300);
insert into mentor values (3,'Ramy', 'Raghab', '1979-02-1','01001001001','ramy.raghab@gmail.com','linkedin-Ramy', 100,1);
insert into mentor values (4,'Tamer', 'Goudah', '1990-02-13','011111100','Timo1@gmail.com','linkedin-timo', 0,2);

