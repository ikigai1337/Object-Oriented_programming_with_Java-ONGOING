
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else{
                numOfNumbers = numOfNumbers + 1;
                sumOfNumbers = sumOfNumbers + number;
            }
            
        }
        System.out.println("Number of numbers: "+numOfNumbers);
        System.out.println("Sum of the numbers: "+sumOfNumbers);

    }
}