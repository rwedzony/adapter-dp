package com.rafsoft;

public class Main {

    public static void main(String[] args) {
       Adaptee adaptee = new Adaptee();
       TargetAdapter targetAdapter = new TargetAdapter(adaptee);
       targetAdapter.operation();

    }
}
