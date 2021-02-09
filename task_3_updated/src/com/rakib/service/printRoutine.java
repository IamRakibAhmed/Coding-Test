package com.rakib.service;

import com.rakib.domain.routine.Routines;

import java.util.Arrays;

public class printRoutine {
    public static void print() {
        Object[][] routine = Routines.getRoutine();

        try {
            for (int i = 0; i < routine.length; i++) {
                for (int j = 0; j < routine[0].length; j++) {
                    String data = Arrays.toString((Object[]) routine[i][j]);

                    if (!data.equals("null")) {
                        int idx = data.lastIndexOf(',');
                        String res = data.substring(1, idx);
                        System.out.println(i + " " + j + " " + res);
                    }
                }
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("No Routine Found !");
            System.out.println("");
        }
    }
}
