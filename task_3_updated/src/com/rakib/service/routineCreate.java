package com.rakib.service;

import com.rakib.repository.RoutineData;

public class routineCreate {
    public static void createRoutine() {
        RoutineData data = new RoutineData();
        data.create();
    }
}
