import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int change = 1000 - N;
        int count = 0;
        int tmp;

        if(change / 500 >= 1){
            tmp = change % 500;
            count += (int) Math.floor((double)change / 500);
            change = tmp;
        }
        if(change / 100 >= 1){
            tmp = change % 100;
            count += (int) Math.floor((double) change / 100);
            change = tmp;
        }
        if(change / 50 >= 1){
            tmp = change % 50;
            count += (int) Math.floor((double) change / 50);
            change = tmp;
        }
        if(change / 10 >= 1){
            tmp = change % 10;
            count += (int) Math.floor((double) change / 10);
            change = tmp;
        }
        if(change / 5 >= 1){
            tmp = change % 5;
            count += (int) Math.floor((double) change / 5);
            change = tmp;
        }
        if(change >= 1){
            count += change;
        }
        System.out.println(count);
    }
}