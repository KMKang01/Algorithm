class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 처음 읽은 글자를 token으로 저장, lCount로 증가
        // 다른 글자는 rCount로 증가
        String token = "";
        int lCount = 0;
        int rCount = 0;
        
        int wordCount = 0;
        
        String [] sArr = s.split("");
        
        for(int i = 0; i < s.length(); i++) {
            if(token.equals("")) {
                token = sArr[i];
                lCount++;
            } else if (token.equals(sArr[i])) {
                lCount++;
            } else {
                rCount++;
            }
            
            if(lCount > 0 && lCount == rCount) {
                token = "";
                lCount = 0;
                rCount = 0;
                wordCount++;
            }
        }
        
        if(!token.equals("")) {
            wordCount++;
        }
        
        return wordCount;
    }
}