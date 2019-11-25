package com.company;

import java.util.ArrayList;

public class Hospital {
    String name;
    Address adress;
    Phone phone;

    public ArrayList<Department> departmentslist = new ArrayList<>();

    public void addDepartment(Department d){
        departmentslist.add(d);
    }
}
