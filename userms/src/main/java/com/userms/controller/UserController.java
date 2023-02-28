package com.userms.controller;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userms.model.Users;
import com.userms.services.UserService;
import com.userms.Util.UserUtil;

import jakarta.annotation.Nullable;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    public UserService userserivce;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody String user) {
        JSONObject json = new JSONObject(user);
        List<String> validationList = UserUtil.validate(json);

        if (validationList.isEmpty()) {
            Users newuser = UserUtil.setUser(json);
            userserivce.addUser(newuser);
            return new ResponseEntity<String>("save user", HttpStatus.CREATED);
        } else {
            Object[] answer = Arrays.copyOf(validationList.toArray(), validationList.size(), String[].class);

            return new ResponseEntity<>("Please pass these mandatory parameters- " + Arrays.toString(answer),
                    HttpStatus.BAD_REQUEST);
        }

    }


    @GetMapping(value = "/getUserbyId")
    public  List<Users>  getAllUser(@Nullable @RequestParam String userid) {
        return userserivce.getUser(userid);
    }

    @DeleteMapping(value = "/deleteUser/{userid}")
    public ResponseEntity<String> deleteUser(@PathVariable String userid) {
        ResponseEntity<String> msg = userserivce.deleteUser(userid);
        return msg;
    }

    @PutMapping(value="/updateUser/{userid}")
    public ResponseEntity<String> updateUser(@RequestBody String user ,@PathVariable int userid){
        ResponseEntity<String> msgEntity=userserivce.updateUser(user,userid);
        return msgEntity;
    }


}
