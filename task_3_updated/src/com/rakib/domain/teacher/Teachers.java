package com.rakib.domain.teacher;

import com.rakib.domain.course.Courses;
import java.util.ArrayList;

public class Teachers {
    private final String teacher_name;
    private final int teacher_ID;
    private ArrayList<Courses> courses;

    public Teachers(int id, String name) {
        this.teacher_name = name;
        this.teacher_ID = id;
    }

    public void setCourses(Courses course) {
        this.courses.add(course);
    }

    public int getTeacherID() {
        return teacher_ID;
    }

    public String getTeacherName() {
        return teacher_name;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return teacher_name;
    }
}
