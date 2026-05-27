class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int d : num_list) if (n == d) answer = 1;
        return answer;
    }
}