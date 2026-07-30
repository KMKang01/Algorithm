import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(checkValidateDate(m, d));
    }

    public static String checkValidateDate(int m, int d) {
        if(m > 12) {
            return "No";
        } else {
            switch(m) {
                case 1:  case 3:  case 5:  case 7:  case 8: case 10: case 12:
                    if(d <= 31) return "Yes";
                    else return "No";
                    // break;
                case 4: case 6: case 9: case 11:
                    if(d <= 30) return "Yes";
                    else return "No";
                    // break;
                case 2:
                    if(d <= 28) return "Yes";
                    else return "No";
                    // break;
                default:
                    return "No";
                    // break;
            }
        }
    }     
}