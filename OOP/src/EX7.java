public class EX7 {

    public static void main(String[] args) {

        /******* Access Modifier *********/
        Student student = new Student("John", 18, "Black", 'm');

        student.setAge(25);

//        Encapsulation
//        Getter and Setter
//        This is the concept of making everything, every class as secure.

       System.out.println (student.getAge());



    }
}
