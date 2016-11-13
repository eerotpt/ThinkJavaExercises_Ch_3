/**
 * Created by a on 10/11/2016.
 */
import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {
    public static void main(String[] args){
        // pick a random number
        Random randomNumber = new Random();
        Scanner in = new Scanner(System.in);
        int number=randomNumber.nextInt(100)+1;
        System.out.println("I`m thinking of a number between 1 and 100");
        System.out.print("Can you guess what it is?\n");
        System.out.println("Type a number");
        int guess=in.nextInt();
        System.out.println("Your guess is: "+guess);
        System.out.println("The number I was thinking of is : "+number);
        int offNum=number-guess;
        if (offNum<0){
             offNum=offNum*(-1);
            System.out.println("Youwere off by : "+offNum);
        }else{
        System.out.println("Youwere off by : "+offNum);
    }
}}
