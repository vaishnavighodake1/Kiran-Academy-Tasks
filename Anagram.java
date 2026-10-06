import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word 1: ");
        String word1 = sc.nextLine();

        System.out.print("Enter word 2: ");
        String word2 = sc.nextLine();

        char[] a = word1.toLowerCase().toCharArray();
        char[] b = word2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Words are Anagram");
        } else {
            System.out.println("Words are Not Anagram");
        }
    }
}

/*
Output:
Anangram:
Enter word 1: listen
Enter word 2: silent
Words are Anagram
Non-anagram:
Enter word 1: hello
Enter word 2: world
Words are Not Anagram
*/