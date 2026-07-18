class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
       
        if(date1[0] < date2[0]) { // 1의 연도가 작은 경우
            answer = 1;   
        } else if (date1[0] == date2[0]) { // 연도 같은 경우
            if(date1[1] < date2[1]) { // 1의 월이 작은 경우
                answer = 1;
            } else if (date1[1] == date2[1]) { // 월 같은 경우
                if(date1[2] < date2[2]) {
                    answer = 1;
                }
            }
        }
        
        return answer;
    }
}