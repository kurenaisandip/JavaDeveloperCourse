package Inheritance;

public class CodeTest {

    public static void main(String[] args) {



//        Creation of objects;
        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();

        System.out.println(employee.getVacationDays());
        System.out.println(lawyer.getLawyerPosition());
        System.out.println(secretary.getVacationDays());

        System.out.println("The Salary of lawyer is: "+lawyer.getSalary());

//        PolyMorphism
//        The ability for the same code to be used with several different types of
//        object is called polymorphism.

        Employee[] employees = new Employee[10];
        employees[0] = lawyer;
        employees[1] = secretary;  // This is one of the most useful implementation of inheritance
        employees[2] = marketer;
        employees[3] = legalSecretary;

//        Example of polymorphism

//        Employee employee1 = new lawyer();
//        Employee employee2 = Secretary();
//        Employee employee3 = Marketer();
    }
}
