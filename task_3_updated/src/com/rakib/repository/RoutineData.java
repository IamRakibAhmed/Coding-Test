package com.rakib.repository;

import com.rakib.domain.course.courseList;
import com.rakib.domain.routine.Routines;

import java.util.ArrayList;
import java.util.Scanner;

public class RoutineData implements getData, createData {
    @Override
    public void create() {
        Object[][] arr = new Object[5][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < courseList.list.length; i++) {
            System.out.println((i + 1) + ". " + courseList.list[i][0]);
        }

        int iterate = 0;
        while (iterate < 4) {
            int day = sc.nextInt();
            int hour = sc.nextInt();
            int course = sc.nextInt();

            arr[day][hour] = courseList.list[course];
            iterate++;
        }

        Routines routine = new Routines(arr);
    }

    @Override
    public ArrayList<RoutineData> getDataList() {
        return null;
    }
}
