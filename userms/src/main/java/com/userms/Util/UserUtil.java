package com.userms.Util;

import com.userms.model.Users;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.userms.model.Users;
import com.userms.services.UserService;


public class UserUtil {
    public static Users setUser(JSONObject json) {

        Users user=new Users();
        user.setUsername(json.getString("username"));
        user.setDateOfBirth(json.getString("dateOfBirth"));
        user.setEmail(json.getString("email"));
        String number=json.getString("phoneNumber");
        number="+91 "+number;
        user.setPhone_Number(number);
        LocalTime currTime = LocalTime.now();
        user.setTime(currTime);
        LocalDate currDate = LocalDate.now();
        user.setDate(currDate);

        return user;
    }
    public static List<String> validate(JSONObject json) {

        List<String> errorList = new ArrayList<>();

        if(!json.has("username")) {
            errorList.add("username");
        }

        if(!json.has("dateOfBirth")) {
            errorList.add("dateOfBirth");
        }
        else {
            String dob=json.getString("dateOfBirth");
            System.out.println(dob);
            boolean ans=Validation.isValidDate(dob);
            System.out.println(ans);
            if(ans==false) {
                errorList.add("Enter Valid Birthdate! Date Should be in dd-mm-yyyy");
            }
        }

        if(!json.has("phoneNumber")) {
            errorList.add("phoneNumber");
        }
        else {
            String numberString=json.getString("phoneNumber");
            boolean ans=Validation.isvalidMobileNumber(numberString);
            if(ans==false) {
                errorList.add("Enter Valid Mobile Number ");
            }
        }

        if(!json.has("email")) {
            errorList.add("email");
        }
        else {
            String email=json.getString("email");
            boolean ans=Validation.isValidEmail(email);
            if(ans==false) {
                errorList.add("Enter Valid Email address ");
            }
        }

        return errorList;

    }

}
