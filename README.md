
# THE MENTOR

This project involves designing a Mentoring Management System, which aims
to connect mentors and mentees for professional guidance and skill development.
The system comprises a set of relational database tables and relationships to 
store information about countries, skills, job titles, mentoring requests, mentoring
offers, mentors, mentees, and related entities.

## Features

* **User Registration and Authentication**
   * Allow mentors and mentees to register and log in securely.
* **Profile Management:**
  *  Enable users (mentors and mentees) to create and manage their profiles, including personal information, skills, and work experiences.   
* **Mentor Search and Filtering:**
  * Implement a search functionality to help mentees find suitable mentors based on skills, expertise, location, or availability.

* **Mentoring Request System:**
  * Allow mentees to send mentoring requests to specific mentors, specifying the desired skill, support description, and number of hours.
* **Mentoring Offers:**
  * Enable mentors to respond to mentoring requests with offers, including details like discount rates, customized messages, and proposed terms.

## Technologies Used
  
* spring boot
* jwt for authentication
* postgres database
* bcrypt for password hashing


## Getting Started
  ### Prerequisites
*   PostgresSQL installed on your machine


### Installation
     git clone https://github.com/Mohamedmagdy1790/The-Mentor.git

## API Reference

#### Get mentee

```http
  GET /api/mentee/{menteeName}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `menteeName` | `string` | **Required**. The first name of the mentee |

#### Response
``` json
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "birthDate": "2023-01-05T12:30:00Z",
  "email": "john.doe@example.com",
  "phone": "123-456-7890",
  "mentoringRequests": [
    {
      "id": 1,
      "requestDetails": "...",
      "status": "Pending"
    },
    {
      "id": 2,
      "requestDetails": "...",
      "status": "Accepted"
    }
    // Additional mentoring requests
  ]
}
```
#### Get mentor

```http
  GET /api/mentor/{mentorName}
```

| Parameter    | Type     | Description                                |
|:-------------| :------- |:-------------------------------------------|
| `mentorName` | `string` | **Required**. The first name of the mentor |

#### Response
``` json
{
  {
"id": 3,
"firstName": "Ramy",
"lastName": "Raghab",
"birthDate": "1979-02-01T00:00:00.000+00:00",
"email": "ramy.raghab@gmail.com",
"phone": "01001001001",
"linkedinURL": "linkedin-Ramy",
"hourlyPrice": "100",
"lookupCountry": {
"id": 1,
"countryName": "Egypt"
},
"workExperienceList": []
}
  ]
}
```


