import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cost_price = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double selling_price = sc.nextDouble();

        if (selling_price > cost_price) {
            System.out.println("Profit = " + (selling_price - cost_price));
        } else if (cost_price > selling_price) {
            System.out.println("Loss = " + (cost_price - selling_price));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}



/*
Output
Profit:
Enter cost price: 500
Enter selling price: 650
Profit = 150.0
Loss:
Enter cost price: 800
Enter selling price: 700
Loss = 100.0
*/

