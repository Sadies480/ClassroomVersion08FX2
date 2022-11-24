package com.classroom.classroomversion08fx.logic;

import java.util.ArrayList;

public class Course {

    private final ArrayList<Student> students;

    public Course (ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents () {
        return students;
    }

    public void sortStudents (boolean sortByGrade) {
    }
}
