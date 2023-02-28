package com.ums.Controller;

import com.ums.servics.userservice;
import com.ums.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private userservice usr;

    @GetMapping("getuser/{id}")
    public User findUser(@PathVariable int id)
    {
        return usr.getUser(id);
    }
   @GetMapping("getalluser")
   public List<User> getListOfUsers() {
       return usr.finaAll();
   }
    @PostMapping("adduser")
    public void addUser(User userDetails) {

        usr.addUser(userDetails);
    }
 
    @PutMapping("udateUser")
    public void updateUser(@PathVariable int userId,@RequestBody User user){
        usr.updateById(userId,user);
    }
    @DeleteMapping("/delete/{userId}")
    public void deleteUder(@PathVariable int userId) {
        usr.deleteById(userId);
    }


}
