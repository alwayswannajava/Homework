package com.company.Homework;

public class Volvo implements RunnableHomework2 {

        /*Patterns Design*/
        /*В качестве фундаментального шаблона был выбран Interface*/
        /*Рассмотрим обычный пример, когда водителю нужен некий интерфейс
         * для взаимодейтсвия с машиной, создадим интерфейс Runnable*/
        /*Машина Volvo реализует интерфейс Runnable*/

    @Override
    public void ahead() {
        System.out.println("Car Volvo is moving ahead");
    }

    @Override
    public void back() {
        System.out.println("Car Volvo is moving back");
    }

    @Override
    public void turn(int degree) {
        System.out.println("Car Volvo is turning on " + degree);
    }
    }





