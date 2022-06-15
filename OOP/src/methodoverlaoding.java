public class methodoverlaoding {



        public static void main(String[] args) {




//            int result1 = SumTwoNumbers(587, 776);

            double result2 = SumTwoNumbers(1.5, 0.5);
            double result3 = SumTwoNumbers(1.5, 0.5, 122.3);
            int result1 = SumTwoNumbers(14, 1);

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);


        } // end of the main method




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

//        Method Overloading
    public static double SumTwoNumbers(double x, double y){
        double result = x + y;

        return result;
    }

    public static double SumTwoNumbers(double x, double y, double z){
        double result = x + y + z;

        return result;
    }





    } // end of class


