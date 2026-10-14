
public class ShoppingBill {

    // Step 1: Electronics GST = 18%
    static double calculateElectronicsGST(double a, double b) {
        return (a + b) * 1.18;
    }

    // Step 2: Fashion GST = 13%
    static double calculateFashionGST(double c, double d) {
        return (c + d) * 1.13;
    }

    // Step 3: Food GST = 7%
    static double calculateFoodGST(double e) {
        return e * 1.07;
    }

    // Step 4: Total bill after GST
    static double totalBill(double a, double b,
                            double c, double d, double e) {
        return calculateElectronicsGST(a, b)
             + calculateFashionGST(c, d)
             + calculateFoodGST(e);
    }

    // Step 5: Apply 20% discount after GST
    static double calculateDiscountedBill(
            double a, double b, double c, double d, double e) {

        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;

        return total - discount;
    }

    public static void main(String[] args) {
        double a = 100, b = 100, c = 100, d = 100, e = 100;

        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        double payable = calculateDiscountedBill(a, b, c, d, e);

        System.out.printf("Electronics after GST = %.2f%n",
                calculateElectronicsGST(a, b));
        System.out.printf("Fashion after GST = %.2f%n",
                calculateFashionGST(c, d));
        System.out.printf("Food after GST = %.2f%n",
                calculateFoodGST(e));
        System.out.printf("Total after GST = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final payable amount = %.2f%n", payable);
    }
}
