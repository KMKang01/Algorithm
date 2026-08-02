class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String [] arr = myString.split("");
        String [] arr2 = pat.split("");
        for(int i = 0 ; i < arr.length - arr2.length + 1; i++) {
            int count = 0;
            for(int j = 0; j < arr2.length; j++) {
                if(arr[i + j].equals(arr2[j])) count++;
                else {
                    count = 0;
                    break;
                }
            }
            if(count == arr2.length) answer++;
        }
        return answer;
    }
}