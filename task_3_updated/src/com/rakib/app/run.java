package com.rakib.app;

import com.rakib.domain.course.Courses;
import com.rakib.domain.course.courseList;
import com.rakib.domain.teacher.Teachers;
import com.rakib.repository.courseData;
import com.rakib.repository.TeachersData;

import java.util.ArrayList;

public class run {
    private static String[][] relateCourseTeacher(ArrayList<Courses> courses, ArrayList<Teachers> teachers) {
        String[][] courseList = new String[5][2];

        for (int i = 0; i < courses.size(); i++) {
            String courseName = courses.get(i).getCourseName();
            String teacherName = teachers.get(i).getTeacherName();
            courseList[i][0] = courseName;
            courseList[i][1] = teacherName;
        }

        return courseList;
    }

    public static void init() {
        TeachersData teachersData = new TeachersData();
        courseData coursesData = new courseData();
        coursesData.create();
        teachersData.create();

        courseList.list = relateCourseTeacher(coursesData.getDataList(), teachersData.getDataList());
    }
}
