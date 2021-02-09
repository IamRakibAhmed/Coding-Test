package com.rakib.domain.routine;

public class Routines {
    private static Object[][] routine;
    public Routines(Object[][] arr) {
        routine = arr;
    }
    public static Object[][] getRoutine() { return routine; }
}
