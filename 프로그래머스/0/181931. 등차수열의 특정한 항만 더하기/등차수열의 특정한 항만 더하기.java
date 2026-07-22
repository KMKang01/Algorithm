class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        int [] arr = new int[n];
        for(int i = 0; i<n; i++) {
            if(included[i]) answer = answer + (a + d * i);
        }
        
        return answer;
    }
}