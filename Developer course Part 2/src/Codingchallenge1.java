import java.util.Scanner;

public class Codingchallenge1 {

    public static void main(String[] args)
    {
     float w ;
     float h ;

     System.out.println("Please Enter your Weight ");

     // Get the entered values from user
        Scanner scanner = new Scanner(System.in);

        w = scanner.nextFloat();

      System.out.println("Please Enter your Height");

        h = scanner.nextFloat();

     float bmi = w/(h*h);

     System.out.println("BMI = " +bmi);

    }
}
