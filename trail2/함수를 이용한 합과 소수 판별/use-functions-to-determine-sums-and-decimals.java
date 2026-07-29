import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(countNumDigitSumEven(findPrime(a, b)));
    }

    public static ArrayList<Integer> findPrime(int a, int b) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i = a; i <= b; i++) {
            boolean flag = true;
            for(int j = 2; j * j <= i; j++) {
                if( i % j == 0) { 
                    flag = false;
                    break;
                }
            }
            if(flag) primeList.add(i);
        }
        return primeList;
    }

    public static int countNumDigitSumEven(List<Integer> list) {
        int count = 0;
        for(int a : list) {
            int sum = 0;
            while(a > 0) {
                sum += a % 10;
                a /= 10;
            }
            if(sum % 2==0) count++;
        }
        return count;
    }
}