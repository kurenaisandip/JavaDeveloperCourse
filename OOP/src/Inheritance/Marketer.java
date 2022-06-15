package Inheritance;

public class Marketer extends Employee {

//    public int gerHours(){
//        return 40;
//    }
//
//    public double getSalary(){
//        return 4000.0;
//    }
//
//    public int getVacationDays(){
//        return 10;
//    }

//    This method is only for marketer

    public boolean insideMarket(){
        return true;
    }

//    To change the value in Marketer from the Employee we have to use
//    Method Overloading

//    Super Keyword

//    A constructor for a child class always starts with an invocation of one
//    of the constructors inthe parent class. If the parent class has several
//    constructor then the one which is invoked is determined by
//    matching argument lists.

//    For example, we could define a second constructor for movie that does not include an argument foe length

//    It starts out by invoking the parent constructor that does not have an argument for length.
    @Override
//    Overriding is to implement a new version of method to replace code that would otherwise have been
//    inherited from super class.
    public int getHours(){

//        Make it 50 instead of 40 .....
        return 50;
    }



}
