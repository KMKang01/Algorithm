import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 780 && 620 <= a){
            System.out.println("Red");
        } else if (a < 620 && a >= 590){
            System.out.println("Orange");
        } else if (a < 590 && a >= 570){
            System.out.println("Yellow");
        } else if(a < 570 && a >= 495){
            System.out.println("Green");
        } else if(a < 495 && a >= 450){
            System.out.println("Blue");
        } else if (a <450 && a>=425) {
            System.out.println("Indigo");
        } else if (a < 425 && a >= 380){
            System.out.println("Violet");
        }
    }
}