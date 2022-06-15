public class duplicate
{
    public static void main(String[] args) {
//        Exercise 12
//        WAP that finds the duplicate values of array


        int[] array = new int[] {1,2 ,3, 4, 5, 5, 6, 6, 7, 8,8, 9};

        for (int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++){

                if (array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
