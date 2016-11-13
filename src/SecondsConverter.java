/**
 * Created by a on 10/11/2016.
 */
import java.util.Scanner;
public class SecondsConverter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the seconds : \n");
        int sec=in.nextInt();
        int hour=sec/60/60;
        int minute=sec % 3600 /60;
        int seco=sec % 3600 % 60;
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds",sec,hour,minute,seco);

    }
}
