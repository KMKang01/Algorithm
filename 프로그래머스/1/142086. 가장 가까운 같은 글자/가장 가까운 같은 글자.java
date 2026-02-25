class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int [s.length()];
        int [] arr = new int [26]; // -1인 상태는 초기
        for(int i = 0; i<arr.length; i++) arr[i] = -1;
        
        for(int i = 0 ; i < s.length(); i++) {
            String ch = Character.toString(s.charAt(i)); // 글자 뽑기
            if(arr[s.charAt(i) - 'a'] == -1) {
                // 맨 처음 글자인 경우
                answer[i] = -1;
                System.out.println("first");
            } else {
                // 이후에 나온 글자인 경우
                answer[i] = i - arr[s.charAt(i) - 'a'];
                System.out.println("after");
            }
            arr[s.charAt(i) - 'a'] = i;
        }
        
        
        
        return answer;
    }
}