public class Ex10 {

    public static void main(String[] args)
    {
//        types of Variables
//        There are three types of variables in Java:

//        Local variables       (non static)
//        The local variable is a variable defined within
//        a block or method or constructor

//        Instance variables    (non static)
//        are declared in a class outside my method, constructor or block

//        Static variables      (static)

//        Static variable
//        When a variable is declared as a static,
//        then a single copy of a variable is created and shared
//        among all the levels of class

//        We can create static variable at class level only
//        a static block and static variables are executed


        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s2.getId());


    }

    static int k = 0;
}
