import java.util.Scanner;

public class IT24101574Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i + ": ");
           
	    System.out.print("Enter Marks: ");
	    String[] marks = scanner.nextLine().split(" ");

            int sum = 0;
            for (String mark : marks) {
                sum += Integer.parseInt(mark);
            }

            double average = (double) sum / 4;

            System.out.println("Average is : " + average);

           if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } 
	    else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } 
	    else {
            System.out.println("Overall Grade is : Fail");
        }
    }
           
        }
    

    
    }
