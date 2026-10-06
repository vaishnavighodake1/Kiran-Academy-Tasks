import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age >= 18) {
            System.out.println("Eligible for Voting");
        } else {
            System.out.println("Not Eligible for Voting");
        }
    }
}


/*
age above 18:
Enter age: 20
Eligible for Voting
age below 18:
Enter age: 15
Not Eligible for Voting
*/