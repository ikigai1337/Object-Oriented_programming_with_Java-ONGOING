
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftprice = Integer.valueOf(scan.nextLine());
        double tax=0;
        double first = 100;
        double second = 1700;
        double third = 4700;
        double forth = 22100;
        double fifth = 142100;
        if (giftprice < 5000) {
            System.out.println("No Tax!");
        } else if(giftprice <=25000){
            tax = (first+(giftprice-5000)*0.08);
            System.out.println("Tax: " + tax);
        } else if(giftprice <=55000){
            tax = (second+(giftprice-25000)*0.10);
            System.out.println("Tax: " +tax);
        } else if(giftprice <=200000){
            tax = (third+(giftprice-55000)*0.12);
            System.out.println("Tax: " +tax);
        } else if(giftprice <=1000000){
            tax = (forth+(giftprice-200000)*0.15);
            System.out.println("Tax: " +tax);
        } else{
            tax = (fifth+(giftprice-1000000)*0.17);
            System.out.println("Tax: " +tax);
        }

    }
}
