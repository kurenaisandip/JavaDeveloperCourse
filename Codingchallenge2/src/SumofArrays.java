import java.util.Scanner;
public class SumofArrays {

    public static void main(String[] args) {
//        Exercise 6
//        WAP in java that allows the user to enter
//        10 numbers and give their sum

//        1st step
        System.out.println("Please enter 10 values");

        Scanner scanner = new Scanner(System.in);

//        2nd Step: filling up the array
        int[] my_array = new int[10];

        for (int i = 0; i< my_array.length; i++){
            my_array[i] = scanner.nextInt();
        }

//        3rd Step: finding the sum
        int sum = 0;
        for (int i: my_array)
        {
            sum = sum +i;
        }

            System.out.println("THe values are as follow: " +sum);

    }
}
