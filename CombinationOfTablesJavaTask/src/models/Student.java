package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    int id;
    String name;
    String gender;
    String sem;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", sem='" + sem + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, String gender, String sem) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.sem = sem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }
}
