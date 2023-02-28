package com.userms.services;


import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.userms.model.Users;
import com.userms.repo.UserRepo;


@Service
public class UserService {
    @Autowired
    public UserRepo userrepo;


    public void addUser(Users user) {
        userrepo.save(user);
    }


    public  List<Users>  getUser(String userid) {
        List<Users> user;
        if(null!=userid) {
            user=new ArrayList<Users>();
            user.add(userrepo.findById(Integer.parseInt(userid)).get());
        }
        else {
            user=userrepo.findAll();
        }

        return user;

    }


    public ResponseEntity<String> deleteUser(String userid) {
        if(userid!=null) {
            userrepo.deleteById(Integer.parseInt(userid));
            return new ResponseEntity<>("User Deleted ", HttpStatus.OK) ;
        }else {
            return new ResponseEntity<>("Eneter User Id ", HttpStatus.OK) ;
        }

    }

    public ResponseEntity<String> updateUser(String user,int userid) {
        try {
            JSONObject json=new JSONObject(user);
            Users user2=userrepo.findById(userid).get();

            user2.setUsername(json.getString("username"));
            user2.setDateOfBirth(json.getString("dateOfBirth"));
            user2.setEmail(json.getString("email"));
            String number=json.getString("phoneNumber");
            number="+91 "+number;
            user2.setPhone_Number(number);
            userrepo.save(user2);

            return new ResponseEntity<>("Updated",HttpStatus.CREATED);
        }
        catch (Exception e) {

            return new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);

        }
    }
}
