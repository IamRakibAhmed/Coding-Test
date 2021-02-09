package com.rakib.service;

import com.rakib.domain.course.courseList;

public class courseTeacherList {
    public static void list() {
        for (int i = 0; i < courseList.list.length; i++) {
            System.out.println(courseList.list[i][0] + ", " + courseList.list[i][1]);
        }

        System.out.println("");
    }
}
