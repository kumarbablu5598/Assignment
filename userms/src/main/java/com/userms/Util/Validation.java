package com.userms.Util;

public class Validation {
    public static boolean isValidDate(String d)
    {
        String regex = "\\d{1,2}-\\d{1,2}-\\d{4}";
        return d.matches(regex);

    }

    public static boolean isValidEmail(String email) {
        String regex="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        return email.matches(regex);
    }

    public static boolean isvalidMobileNumber(String number) {
        if(number.length()!=10) { return false; }

        else {
            for(char c:number.toCharArray()) {
                if(!(c>=48 && c<=57))
                    return false;
            }
            return true;
        }
    }
}
