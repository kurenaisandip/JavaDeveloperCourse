public class nestedloop {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++) {
            // Spaces loop
            for (int k = 1; k <= i - 1; k++){
                System.out.println(" ");}
                for (int j = 5; j >= i; j--) {
                    System.out.print("*");
                }
//                System.out.println();
            }

    }
}
