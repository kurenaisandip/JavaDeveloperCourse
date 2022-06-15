public class insertelement {

    public static void main(String[] args) {
//        Exercise 9
//        WAP that inserts an elements into array

        int[] array = {25, 14, 56, 36};

//        Insert an element (99) at 3rd position
        int index_to_insert = 2 ;

        for ( int i = array.length -1; i > index_to_insert; i--)
        {
//            Inserting the elements from the left to right
            array[i] = array[i-1];
        }

//        Filling up the empty space inside array
        array[index_to_insert] = 99;

//        Printing the array

        for ( int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("Array length" +array.length);
    }
}
