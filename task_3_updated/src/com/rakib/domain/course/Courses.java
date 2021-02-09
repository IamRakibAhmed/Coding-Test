package com.rakib.domain.course;

import com.rakib.domain.teacher.Teachers;
import java.util.ArrayList;

public class Courses {
    private final int course_ID;
    private final String course_name;
    private ArrayList<Teachers> teachers;

    public Courses(int id, String name) {
        this.course_ID = id;
        this.course_name = name;
    }

    public void setTeacher(Teachers teacher) {
        this.teachers.add(teacher);
    }

    public int getCourseID() {
        return course_ID;
    }

    public String getCourseName() {
        return course_name;
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }
}
