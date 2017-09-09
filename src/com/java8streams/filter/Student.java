package com.java8streams.filter;

public class Student {

    public Student(String name, String grade, Integer rank) {
        this.name = name;
        this.grade = grade;
        this.rank = rank;
    }

    private String name;

    private String grade;

    private Integer rank;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
