
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            if(direction.equals("right")) {
                answer[i] = numbers[(i - 1) >= 0 ? (i - 1) : numbers.length - 1];
            } else {
                answer[i] = numbers[(i + 1) <= numbers.length - 1 ? i + 1 : 0 ];
            }
            
        }
        return answer;
    }
}