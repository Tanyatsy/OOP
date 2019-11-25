package com.company;

public class D extends C{
    protected String d;
    protected X x = new X("xxx2");
    D(String d , X x ){
        super("blabla", x);
        this.d = d;
    }
}
