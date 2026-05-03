class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sumSquare = 0;
        for(int num : num_list) {
            sumSquare += num;
            mul *= num;
        }
        sumSquare *= sumSquare;
        return sumSquare > mul ? 1 : 0;
    }
}