package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    int Id;
    String Name;
    String Semister;
    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Semister='" + Semister + '\'' +
                '}';
    }

    public Course() {
    }

    public Course(int id, String name, String semister) {
        Id = id;
        Name = name;
        Semister = semister;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSemister() {
        return Semister;
    }

    public void setSemister(String semister) {
        Semister = semister;
    }


}
