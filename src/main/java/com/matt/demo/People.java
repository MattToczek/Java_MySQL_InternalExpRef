package com.matt.demo;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class People {
    private int ID;
    private String name;
    private String skills;

    //No arg constructor
    public People(){
    }

    // constructor with all arguments
    public People(int ID, String name, String skills){
        this.ID = ID;
        this.name = name;
        this.skills = skills;

    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getSkills() {
        return skills;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}

