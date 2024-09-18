import java.util.Scanner;

public class IT24101574Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Customer " + (i + 1));
	    System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for Cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                double amountToPay = billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (paymentMode == 'O' || paymentMode == 'o') {
               System.out.println("No discount applicable"); 
	       System.out.println("Amount to be paid: " + billAmount);
		
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}