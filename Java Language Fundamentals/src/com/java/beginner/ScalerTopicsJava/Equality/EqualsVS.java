package com.java.beginner.ScalerTopicsJava.Equality;

public class Equality2 {

    int RollNumber;
    String Name;
    String Subject;
    int Score;
    public int getRollNumber() {
        return RollNumber;
    }
    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }
    public int getScore() {
        return Score;
    }
    public void setScore(int score) {
        Score = score;
    }
    public Equality2(int RollNumber, String Name, String Subject, int Score) {
        this.RollNumber = RollNumber;
        this.Name = Name;
        this.Subject = Subject;
        this.Score = Score;
    }


    public static void main(String[] args) {
        String obj1 = new String("Computer Science");
        String obj2 = new String("Computer Science");
        Equality2 s1 = new Equality2(1,"Nithin","Electronics Science",100);
        Equality2 s2 = new Equality2(2,"Nishanth",obj1,90);
        Equality2 s3 = new Equality2(3,"Nishanth",obj2,100);
        if (s1.equals(s2)) {
            System.out.println("Score is same");
        }
        else {
            System.out.println("Score is different");
        }
    }
}
