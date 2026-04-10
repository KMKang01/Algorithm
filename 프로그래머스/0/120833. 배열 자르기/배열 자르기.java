class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = new int [num2 - num1 + 1];
        int i = 0;
        while (num1 <= num2) {
            answer[i++] = numbers[num1++];
        }
        return answer;
    }
}