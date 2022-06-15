public class minmax {

    public static void main(String[] args) {

//        Exercise 10
//         WAP that finds the max and in of array

        int[] array = {25, 14, 15, 56, 144, 99, 55, 1};
//        Always assume the first array to be max value then compare it to the rest of the array and find max and min on the basic of it

//        finding the min
        int min = array[0];

        for ( int i = 1; i < array.length; i++)
        {
//           Comparing the value of elements with min
            if (array[i] < min){
//                Switching the smallest elements
                min = array[i];
            }
        }

        System.out.println("The min array is : " +min);

//        finding the min
        int max = array[0];

        for ( int i = 1; i < array.length; i++)
        {
//           Comparing the value of elements with max
            if (array[i] > max){
//                Switching the greatest elements
                max = array[i];
            }
        }

        System.out.println("The max array is : " +max);

    }
}
