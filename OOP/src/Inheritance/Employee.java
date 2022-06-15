package Inheritance;

// This class will be consider as a Super Class

public class Employee {

//    This is the Example of inheritance to understand it better.
//    It is exercise no 13

    public int getHours(){
        return 40;
    }

    public double getSalary(){
        return 4000.0;
    }

    public int getVacationDays(){
        return 10;
    }

    //    A constructor for a child class always starts with an invocation of one
    //    of the constructors inthe parent class. If the parent class has several
    //    constructor then the one which is invoked is determined by
    //    matching argument lists.

}
