package com.homeworkoop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Student {
    private String name;
    private int score;
    private String object;



    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", object='" + object + '\'' +
                '}';
    }

    public void studentAvgScore (int score) {
        if (score ==5) {
            System.out.println("Great job! Your score is excellent");
        }
        else if (score >3) {
            System.out.println("You have good result!");
        } else {
            System.out.println( "You have week score! Please, come for feedback.");
        }
    }
}