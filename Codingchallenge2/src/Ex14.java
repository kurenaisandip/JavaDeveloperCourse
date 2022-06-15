import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

//        Exercise 14
//        WAP that counts the
//        letters, spaces, numbers and other characters of an input string.

        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();

//        2nd Step: Transforming the string into array of char

        char[] chars = enteredText.toCharArray();

//       Checking if the char is space, letter or number
        int spaces = 0;
        int letters = 0;
        int numbers = 0;
        int others = 0;

        for(int i = 0; i < enteredText.length(); i++){
            if (Character.isDigit(chars[i])){
                numbers ++;
            }
            else if (Character.isAlphabetic(chars[i])){
                letters ++;
            }
            else if (Character.isSpaceChar(chars[i])){
                spaces ++;
            }
            else {
                others ++;
            }
        }

        System.out.println("Spaces :"+spaces);
        System.out.println("Spaces :"+numbers);
        System.out.println("Spaces :"+letters);
        System.out.println("Spaces :"+others);
    }
}
