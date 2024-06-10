import java.util.*;

// 수행 -> 수행결과 판독 -> 만족 -> 종료
//                  -> 불만족 -> s 재대입 후 재수행
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("0")) break;

            String[] sArr;
            sArr = s.split("");
            int tmp;
            do {
                tmp = sumOfDigit(sArr);
                if (tmp < 10) {
                    sb.append(tmp + "\n");
                } else {
                    sArr = Integer.toString(tmp).split("");
                }
            } while (tmp>=10);
        }
        System.out.println(sb.toString().trim());
    }

    public static int sumOfDigit(String[] sArr) {
        int sum = 0;
        for (int i = 0; i < sArr.length; i++) {
            sum += Integer.parseInt(sArr[i]);
        }
        return sum;
    }

}