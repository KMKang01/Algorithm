import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int aValue = 0;
        int bValue = 0;
        int cValue = 0;
        Map<String, Integer> vMap = new HashMap<>();

        vMap.put("black", 0);
        vMap.put("brown", 1);
        vMap.put("red",2);
        vMap.put("orange",3);
        vMap.put("yellow",4);
        vMap.put("green",5);
        vMap.put("blue",6);
        vMap.put("violet",7);
        vMap.put("grey",8);
        vMap.put("white",9);

        aValue = vMap.get(a);
        bValue = vMap.get(b);
        cValue = (int)Math.pow(10, vMap.get(c));

        long answer = Long.parseLong(Integer.toString(aValue)+Integer.toString(bValue)) * cValue;
        System.out.println(answer);
    }
}