class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        boolean flag = false;
        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                flag = true;
                answer = i;
                break;
            }
        }
        return flag ? answer : -1;
    }
}