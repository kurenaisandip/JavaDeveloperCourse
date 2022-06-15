public class rotate {

    public static void main(String[] args) {

//        Exercise 13
//        WAP that rotates an array clockwise onr time
//        { 10, 20, 30, 40, 50 } -----> { 50, 40, 30, 20, 10}

        int [] array = new int[] {10, 20 ,30, 40, 50};

        int temp = array[array.length - 1];

        for (int i = array.length -1; i > 0; i--)
        {
            array[i] = array[i-1];
        }
        array[0] = temp;

        for (int i = 0; i < array.length; i++)
        System.out.println(""+array[i]);
    }
}
