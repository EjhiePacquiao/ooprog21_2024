import java.util.Scanner;

public class Billing 
{

    public static void main(String[] args) 
    {
        Billing bill = new Billing();
        Scanner scanner = new Scanner(System.in);
        
        //frst method (price only)
        System.out.print("Enter the price for single item: ");
        double price = scanner.nextDouble();
        double result1 = bill.computeBill(price);  // Store result 1
        
        // scond method (price and quantity)
        System.out.print("Enter the price for multiple items: ");
        price = scanner.nextDouble();
        System.out.print("Enter the quantity: ");
        double quantity = scanner.nextDouble();  
        double result2 = bill.computeBill(price, quantity);  // Store result 2
       
        // thrd method (price, quantity, and coupon discount)
        System.out.print("Enter the price with coupon discount: ");
        price = scanner.nextDouble();
        System.out.print("Enter the quantity: ");
        quantity = scanner.nextDouble();  
        System.out.print("Enter the coupon discount (as a percentage): ");
        int coupon = scanner.nextInt();
        double result3 = bill.computeBill(price, quantity, coupon);  // Store result 3
        
        // Display results
        // price only
        System.out.println("\nThe total price for the bill (price only) is: $" + result1);
        // price and quantity
        System.out.println("The total price for the bill (price and quantity) is: $" + result2);
        // price, quantity, and coupon
        System.out.println("The total price for the bill (price, quantity, and coupon) is: $" + result3);
        
        scanner.close();
    }

    // Method1: Single parameter - price
    public double computeBill(double price) 
    {
        double total = price + (price * 0.08);  // Add 8% tax
        return total;
    }

    // Method2: Two parameters - price and quantity (double type for quantity)
    public double computeBill(double price, double quantity) 
    {
        double total = (price * quantity) + ((price * quantity) * 0.08);  // Add 8% tax
        return total;
    }

    // Method3: Three parameters - price, quantity, and coupon discount (double type for quantity)
    public double computeBill(double price, double quantity, int coupon) 
    {
        double subtotal = price * quantity;
        double discount = (coupon / 100.0) * subtotal;
        double total = (subtotal - discount) + ((subtotal - discount) * 0.08);  // Subtract discount and add 8% tax
        return total;
    }
}
