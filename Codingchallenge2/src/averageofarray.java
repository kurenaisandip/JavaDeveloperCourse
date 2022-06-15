import java.util.Scanner;

public class averageofarray {

    public static void main(String[] args) {

//        Exercise 7
//        WAP that allows the user to enter
//        10 numbers and giver their average

//        1st step
        int[] array = new int[10];
        System.out.println("Please enter 10 numbers to find their average");

//        2nd Step:
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.length; i++ )
        {
            array[i] = scanner.nextInt();
        }

//        3rd step finding the average
        int sum = 0;
        double average = 0d;
        for(int e : array)
        {
            sum = sum + e;
        }

        average = sum/array.length;

        System.out.println("The average is: " +average);
    }
}
