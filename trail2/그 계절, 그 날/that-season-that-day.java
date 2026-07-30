import java.util.*;
public class Main {
    static final int [] LEAF_YEAR_DAY = new int [] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static final int [] COMMON_YEAR_DAY = new int [] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        // 1. 윤년, 평년 확인
        boolean isLeafYear = checkLeafYear(y);
        // 2. 올바른 날인지 확인
        boolean isValidateDate = checkValidateDate(isLeafYear, m, d);
        // 3. 계절 출력
        System.out.print(getSeason(isValidateDate, m));
    }

    public static boolean checkLeafYear(int y) {
        if(y % 4 != 0) {
            return false; // 평년
        } else {
            if(y % 100 == 0) {
                if(y % 400 == 0) {
                    return true;
                } else {
                    return false;    
                } 
            } else {
                return true;    
            }

        }
    }

    public static boolean checkValidateDate(boolean isLeafYear, int m, int d) {
        if(isLeafYear) { // 윤년인 경우
            // System.out.println(d >= 1 && d <= LEAF_YEAR_DAY[m] );
            // System.out.println(m + " " + d);
            return d >= 1 && d <= LEAF_YEAR_DAY[m];
        } else {
            // System.out.print(d >= 1 && d <= COMMON_YEAR_DAY[m]);
            return d >= 1 && d <= COMMON_YEAR_DAY[m];
        }
    }

    public static String getSeason(boolean isValidateDate, int m) {
        if(isValidateDate) {
            switch (m) {
                case 3: case 4: case 5: return "Spring";
                case 6: case 7: case 8: return "Summer";
                case 9: case 10: case 11: return "Fall";
                case 12: case 1: case 2: return "Winter";
                default: return "-1";
            }
        } else {
            return "-1";
        }
    }
}