package com.rakib.repository;

import com.rakib.domain.teacher.Teachers;
import java.util.ArrayList;

public class TeachersData implements getData, createData {
    private static final ArrayList<Teachers> teachers = new ArrayList<>();
    @Override
    public void create() {
        teachers.add(new Teachers(1,"John Smith"));
        teachers.add(new Teachers(2,"Lara Gilbert"));
        teachers.add(new Teachers(3,"Johanna Kabir"));
        teachers.add(new Teachers(4,"Danniel Robertson"));
        teachers.add(new Teachers(5,"Larry Cooper"));
    }

    @Override
    public ArrayList<Teachers> getDataList() {
        return teachers;
    }
}
