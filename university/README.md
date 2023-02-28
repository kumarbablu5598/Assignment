
Spring Boot project University Event Management:-> 

This is a sample Java / Maven / Spring Boot application that can be used for University Event Management.

Constraints:->

 Create a student model and an event Model (Id,name,department,branch,location,description,starttime,endtime,date,imageurl)
 
 Student model will have->
 
     StudentId
   
     first name
   
     last name
   
     age
   
     department
   
Event Model will have:---

       eventId
       
       eventName
       
       locationOfEvent
       
       date
       
       startTime
       
       endTime
       
 Endpoints to provided :-       
 
         Add student
         
         update student department
         
         delete student
         
         Get all students 
         
         Get student by Id
         
         Add event
         
         Update event
         
         Delete event
         
        Get All event by date
        


How to Run:->


This application is packaged as a war which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the java -jar command.

Clone this repository.

Make sure you are using JDK 1.8 and Maven 3.x

You can build the project and run the tests by running mvn clean package

Once successfully built, you can run the service by one of these two methods:

      java -jar -Dspring.profiles.active=test target/spring-boot-rest-example-0.5.0.war
 
or

        mvn spring-boot:run -Drun.arguments="spring.profiles.active=test"
        
        
Check the stdout or boot_example.log file to make sure no exceptions are thrown

Once the application runs you should see something like this

          
           2023-02-12T17:33:42.840+05:30  INFO 14708 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2576 ms
           2023-02-12T17:33:43.548+05:30  INFO 14708 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
           2023-02-12T17:33:43.624+05:30  INFO 14708 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
           2023-02-12T17:33:43.639+05:30  INFO 14708 --- [  restartedMain] com.university.UniversityApplication     : Started UniversityApplication in 4.453 seconds (process running for 6.551)


About the Service:->

The service is just a simple University  review REST service. It uses an in-memory database (H2) to store the data. You can also do with a relational database like MySQL or PostgreSQL. If your database connection properties work, you can call some REST endpoints defined in

     com.university.controller  on  port 8080 (see below)
     
More interestingly, you can start calling some of the operational endpoints (see full list below) like /students and event (these are available on port 8080)


You can use this sample service to understand the conventions and configurations that allow you to create a DB-backed RESTful service. Once you understand and get comfortable with the sample app you can add your own services following the same patterns as the sample service.


Here is what this little application demonstrates:

     Full integration with the latest Spring Framework: inversion of control, dependency injection, etc.

     Packaging as a single war with embedded container (tomcat 8): No need to install a container separately on the host just run using the java -jar command

     Demonstrates how to set up students, events, info, environment, etc. endpoints automatically on a configured port. Inject your own students /events info with a few lines of code.


     Writing a RESTful service using annotation: supports both XML and JSON request / response; simply use desired Accept header in your request


     Exception mapping from application exceptions to the right HTTP response with exception details in the body

     Spring Data Integration with JPA/Hibernate with just a few lines of configuration and familiar annotations.

     Automatic CRUD functionality against the data source using Spring Repository pattern

     Demonstrates MockMVC test framework with associated libraries

     All APIs are "self-documented" using annotations

Here are some endpoints you can call:------->

         http://localhost:8080/api/events    // for Events
         
         http://localhost:8080/api/students  // for Students
         
         
         
 endpoints for  Retrieve :
 
        http://localhost:8080/api/events/getallevent     //for all event
        
        http://localhost:8080/api/events/getevent/3     // event based on id
        
        http://localhost:8080/api/students/getallstudent   // studnets all
        
        http://localhost:8080/api/students/getstudent/2   // student based on id
        
  endpoints for creation :  
  
                http://localhost:8080/api/events/addevent    // for Events
                
                http://localhost:8080/api/students/addstudent    // for Student
                
  endpoints for update :   
  
                http://localhost:8080/api/events/update    // for Events
                
                http://localhost:8080/api/students/update    // for Student
  
  
  endpoints for delete :  
  
                 http://localhost:8080/api/events/delete/2    // for Events
                
                 http://localhost:8080/api/students/delete/2     // for Student   
                 
                 
                 
         
 Data structures used in this project  :
 
       ArrayList<Students>
       ArrayList<Events>
       
       class Students {
             int StudentId;
             String firstName;
             String lastName;
             int age;
            String department; 
          }
  
       class Events {
            int eventId;
            String eventName;
            String locationOfEvent;
            String date;
            String  startTime;
            String  endTime;
        }
  
      
Project summary         
          

       The University Event Management project is designed in Spring Boot and Hibernate with Source Code. 
       This project is designed to automate the process of managing university events  

       University  Event Management System Overview:---
       
       
       It is a multi-role application project i.e. Students and Events where Student will have the main control over the system.

      Student will be responsible for managing,planning date,venus for College Events,catering services, and management of the system.On the other hand,student can add,remove for Event,Here, students are basically College authorities that are going to book venues and other services for the College events.

      The overall project is designed using the MVC pattern (MVC i.e. Model, View, and Controller). In the Backend, it is using Spring Boot, at the data access laye the project is using Hibernate Framework.The Database used here is MYSQL.


     




