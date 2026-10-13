import java.util.Scanner;

public class demo{
    //Method Display use
    static void  display(){
        System.out.println(" This Side Vaishnavi");

    }
     //Main Method
    public static void main(String[]args){
        System.out.println("Hello");
        display();
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
        int b = sc.nextInt();
        //Addition
        int add=a+b;
        //substraction
        int sub=a-b;
        //Multiplication
        int mul=a*b;
        //Division
        int div=a/b;
        //Modulus
        int modul=a%b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(modul);
         //Differences
        System.out.println("Difference = " + (a - b));
        sc.close();




       
        
    

    }
}