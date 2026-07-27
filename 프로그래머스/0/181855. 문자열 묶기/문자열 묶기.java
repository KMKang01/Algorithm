class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int [] lengths = new int [31];
        
        for(int i = 0; i<strArr.length;i++){
            lengths[strArr[i].length()]++;
        }
        int max = 0;
        for(int l : lengths) max = Math.max(l, max);
        return max;
    }
}