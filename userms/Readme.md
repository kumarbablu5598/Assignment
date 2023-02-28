#  User management system

### Frameworks and Language used:
 

* Spring
* Spring boot
* Java

### Data Flow 
* Controller :
    * In this Application one Controllers class one is UserController.
* Service
  * In this Application one Serivce class one is UserSerivce.
* Repository
  * In this Application two Repository class one is IUserRepository .
* Database
  * I used H2 Database In this Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.

### Project Summery

User Management system is RESTAPI Application int this you can fetch the data of all User and find Event By UserId , created models User. You can go through the Code to do the CRUD Commands to add delete update and get the data of User .also I am apply validation in this application, all the validation class store in util package. You can also use H2-Database to see the table we have created in the database and to get the data of table.

# Links

### links of Mappings and endpoints.

    addUSer
    
      PostMapping-http://localhost:8080/api/addUser
    
    Get User by Id
      GetMapping-http://localhost:8080/api/getUserbyId?userid=2
    
    Get all User
      GetMapping-http://localhost:8080/api/getUserbyId
    
    updateUser
      PutMapping-http://localhost:8080/api/updateUser/1
    
    deleteUser
      DeleteMapping-http://localhost:8080/api/deleteUser/1
 
 

