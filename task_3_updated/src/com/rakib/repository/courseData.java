package com.rakib.repository;

import com.rakib.domain.course.Courses;
import java.util.ArrayList;

public class courseData implements createData, getData {
    private static final ArrayList<Courses> courses = new ArrayList<>();
    @Override
    public void create() {
        courses.add(new Courses(1,"English Grammar"));
        courses.add(new Courses(2,"Mathematics"));
        courses.add(new Courses(3,"Physics"));
        courses.add(new Courses(4,"Chemistry"));
        courses.add(new Courses(5,"Biology"));
    }

    @Override
    public ArrayList<Courses> getDataList() {
        return courses;
    }
}
