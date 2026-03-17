class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // (1, 31); // 1.1 금
        // (2, 29); // 2.1 월
        // (3, 31); // 3.1 화
        // (4, 30); // 4.1 금
        // (5, 31); // 5.1 일
        // (6, 30); // 6.1 수
        // (7, 31); // 7.1 금
        // (8, 31); // 8.1 월
        // (9, 30); // 9.1 목
        // (10, 31); // 10.1 토
        // (11, 30); // 11.1 화
        // (12, 31); // 12.1 목
        int day = 0; // 0 -> SUN ~ 6 -> SAT
        switch(a) {
            case 1:
                day = 5;
                day = (b + day) % 7;
                break;
            case 2:
                day = 1;
                day = (b + day) % 7;
                break;
            case 3:
                day = 2;
                day = (b + day) % 7;
                break;
            case 4:
                day = 5;
                day = (b + day) % 7;
                break;
            case 5:
                day = 0;
                day = (b + day) % 7;
                break;
            case 6:
                day = 3;
                day = (b + day) % 7;
                break;
            case 7:
                day = 5;
                day = (b + day) % 7;
                break;
            case 8:
                day = 1;
                day = (b + day) % 7;
                break;
            case 9:
                day = 4;
                day = (b + day) % 7;
                break;
            case 10:
                day = 6;
                day = (b + day) % 7;
                break;
            case 11:
                day = 2;
                day = (b + day) % 7;
                break;
            case 12:
                day = 4;
                day = (b + day) % 7;
                break;
        }
        
        switch(day) {
            case 1: answer = "SUN"; break;
            case 2: answer = "MON"; break;
            case 3: answer = "TUE"; break;
            case 4: answer = "WED"; break;
            case 5: answer = "THU"; break;
            case 6: answer = "FRI"; break;
            case 0: answer = "SAT"; break;
        }
        
        return answer;
    }
}