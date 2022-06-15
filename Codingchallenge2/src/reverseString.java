import java.util.Scanner;

public class reverseString {

    public static void main(String[] args)
    {
//        Exercise 15
//        WAP that reverses the entered string

        System.out.println("Please enter a word");
        Scanner scanner = new Scanner(System.in);
        String enteredWord = scanner.nextLine();

        String reversedWord = " ";

//        Converting the String to char[]

        char[] wordArray = enteredWord.toCharArray();

//        Loop in inverse and store the word in reversed word

        for (int i = wordArray.length - 1; i >= 0; i--)
        {
            reversedWord += wordArray[i];
        }

      System.out.println("The reversed word is: " +reversedWord);

    }
}

// This code is not working
