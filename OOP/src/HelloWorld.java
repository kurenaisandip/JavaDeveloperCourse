public class HelloWorld {

    public static void main(String[] args) {

//        String msg = "Hello please rate us on Udemy";
//        int myRating = 5;
//        boolean rate = true;
//        FirstMethod(msg, myRating, rate);


       int result1 = SumTwoNumbers(587, 776);

       System.out.println(result1);


    } // end of the main method


//    a new method
    public static void FirstMethod(String message, int rating, boolean state){
//        Put here your codding block
        System.out.println("" +message + rating + "Stars" + ". Did you rate us?" +state);
    }

//    Returning types of method
//    void: not returning anything
//    String: returns string
//     int: return int
//     and so on..

        /***********       Add 2 numbers and return the result ******/

        public static int SumTwoNumbers(int x, int y){
            int result = x + y;

            return result;
        }







} // end of class
