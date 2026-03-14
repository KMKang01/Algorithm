import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int takes = nums.length / 2; // 가져갈 수 있는 최대
    
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        
        if(takes >= set.size()) {
            answer = set.size();
        } else {
            answer = takes;
        }
        
        return answer;
    }
}