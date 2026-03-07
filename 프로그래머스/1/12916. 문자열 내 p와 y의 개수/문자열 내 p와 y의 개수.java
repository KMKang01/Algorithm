class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        for(String ch : s.split("")){
            if(ch.equals("y") || ch.equals("Y")) yCount++;
            else if(ch.equals("p") || ch.equals("P")) pCount++;
        }
        
        return yCount == pCount;
    }
}