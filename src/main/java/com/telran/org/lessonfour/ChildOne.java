package com.telran.org.lessonfour;

public class ChildOne extends MiddleChild {

//  private ChildOne() {
//        //
//    }

    @Override
    public void printGreetings() {
        System.out.println("Hello i am child one");
    }

    public static ChildOne create(){

      return new ChildOne();
    }
}
