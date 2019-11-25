package com.company;

import java.util.ArrayList;

public class Department {
    public ArrayList<Staff> stafflist = new ArrayList<>();

    public void AddStaff(Staff s){
        stafflist.add(s);
    }
}
