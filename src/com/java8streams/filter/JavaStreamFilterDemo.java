package com.java8streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamFilterDemo {
    private List<Student> studentList = new ArrayList<Student>();

    public JavaStreamFilterDemo() {
        studentList.add(new Student("John", "5th", 1));
        studentList.add(new Student("David", "5th",2));
        studentList.add(new Student("Stefan", "8th", 1));
        studentList.add(new Student("Daniela", "5th", 3));
        studentList.add(new Student("Alice", "8th", 2));

    }

    public void filterDemo() {

        List<Student> fifthGradeStudents = studentList.stream()
                .filter(student -> student.getGrade().equals("5th"))
                .collect(Collectors.toList());

        fifthGradeStudents.forEach(fifthGradeStudent ->
        {
            System.out.println("name = "  + fifthGradeStudent.getName()
                    + " , grade = " + fifthGradeStudent.getGrade()
                    + " , rank = " + fifthGradeStudent.getRank());
        });

    }
}
