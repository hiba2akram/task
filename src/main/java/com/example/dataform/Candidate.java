package com.example.dataform;

public class Candidate {
    String name;
    String id;
    String gender;
    String homeprovince;
    String dob;
    public Candidate(String name, String id, String gender, String homeprovince, String dob) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.homeprovince = homeprovince;
        this.dob = dob;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeProvince() {
        return homeprovince;
    }

    public void setHomeprovince(String homeprovince) {
        this.homeprovince = homeprovince;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "fullName='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", homeProvince='" + homeprovince + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
