public class removeelementfromarray {

    public static void main(String[] args) {

//        Exercise 8
//        WAP that removes an element from array

        int[] array = {25, 12, 13, 11, 45, 33};

//        Remove an element: 2nd element
        int removingIndex = 1;

//         Always use for loop in Multi-dimensional Array
        for (int i = removingIndex; i < array.length - 1; i++ )
        {
//            We are not removing or deleting ...
//            We are shifting the array to the desired index
            array[i] = array[i + 1];
        }
//        Let's print the shifted array
        for (int i = 0; i < array.length -1; i++)
            System.out.println(array[i]);

//
    }
}
