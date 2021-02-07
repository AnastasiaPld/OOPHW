package com.homeworkoop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    private String name;
    private String address;
    private String degree;
    private String faculty;

    static boolean sign = true;

    public static void signForNewClass (){
        if (sign){
            System.out.println("You have been signed. Please, check your schedule after an hour on virtual board.");

        }
    }

}






