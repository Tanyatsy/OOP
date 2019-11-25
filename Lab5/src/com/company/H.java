package com.company;

public class H extends G{
    protected String h;
    private X x = new X("xxx3");
    H(String h , X x ){
        super("blabla", x);
        this.h = h;
    }
}
