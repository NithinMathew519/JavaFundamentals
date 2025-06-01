package com.java.beginner.ScalerTopicsJava.Equality;

public class EqualsVS {

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
    public EqualsVS(int RollNumber, String Name, String Subject, int Score) {
        this.RollNumber = RollNumber;
        this.Name = Name;
        this.Subject = Subject;
        this.Score = Score;
    }


    public static void main(String[] args) {
        String obj1 = new String("Computer Science");
        String obj2 = new String("Computer Science");
        EqualsVS s1 = new EqualsVS(1,"Nithin","Electronics Science",100);
        EqualsVS s1copy = s1;
        EqualsVS s2 = new EqualsVS(2,"Nishanth",obj1,90);
        EqualsVS s3 = new EqualsVS(3,"Nishanth",obj2,100);
        if (s1.equals(s2)) {
            System.out.println("Score is same");
        }
        else {
            System.out.println("Score is different");
        }
        System.out.println(s1==s2);
        System.out.println(s1==s1copy);
        System.out.println(s1.getScore()==s3.getScore());
        System.out.println(s2==s3);
    }
}