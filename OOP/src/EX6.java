public class EX6 {

    public static void main(String[] args) {

//        Constructor
//        This constructor simply initializes all fields of the object
//        with their default values.

//        Strings are initialized to null and integers to zero.


//        Creating an object with default empty constructor
        Student student1 = new Student();
        System.out.println("Student1 name: "+student1.name);


//       Creating an object with full states constructor
        Student student2 = new Student("John",18, "White",'M' );
        System.out.println("Student2 name: "+student2.name);
    }
}
