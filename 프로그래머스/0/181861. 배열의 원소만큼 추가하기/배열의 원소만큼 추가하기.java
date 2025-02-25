import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        int[] answer = new int[sum];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = idx; j < idx + arr[i]; j++) {
                answer[j] = arr[i];
            }
            idx += arr[i];
        }
        
        return answer;
    }
}