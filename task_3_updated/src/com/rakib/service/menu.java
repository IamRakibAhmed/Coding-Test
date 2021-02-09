package com.rakib.service;

import java.util.Scanner;

public class menu {
    public static void operate() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("A. Create Routine");
            System.out.println("B. Show Routine");
            System.out.println("C. List Courses with Teachers Name");
            System.out.println("D. Exit");

            switch (sc.next().toUpperCase().charAt(0)) {
                case 'A' -> routineCreate.createRoutine();
                case 'B' -> printRoutine.print();
                case 'C' -> courseTeacherList.list();
                case 'D' -> flag = true;
                default -> System.out.println("Wrong Input !");
            }
        }
    }
}
