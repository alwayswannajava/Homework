package com.company.Homework;

public class Ford implements RunnableHomework2 {
    /*Машина Ford также реализует интерфейс Runnable*/

    @Override
    public void ahead() {
        System.out.println("Car Ford is moving ahead");
    }


    @Override
    public void back() {
        System.out.println("Car Ford is moving back");
    }

    @Override
    public void turn(int degree) {
        System.out.println("Car Ford is turning on " + degree);
    }
}
