/**
 * Created by a on 10/11/2016.
 */
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double celsius;
        System.out.print("Converting from celsius to fahrenheit\n");
        System.out.println();
        System.out.print("Please input the temperature in celsius : \n");
        celsius=in.nextDouble();
        double fahrenheit=celsius*9.0/5.0+32;
        System.out.printf("%.1f C = %.1f F",celsius ,fahrenheit);

    }
}
