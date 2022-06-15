public class reversearray {

    public static void main(String[] args) {

//        Exercise 10
//        WAP that reverses an array

        int [ ] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i = 0; i < array.length/2; i++)
        {
            int temp = array[i];

            array[i] = array[array.length -i -1 ];
            array[array.length -i - 1] = temp;

        }

        System.out.println(array.length);
//        How to show output of reverse array
    }
}
