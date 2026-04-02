class Solution {
    public String solution(String s, String skip, int index) {
        String [] skipAlphabet = skip.split("");
        String [] sArr = s.split("");
        
        StringBuilder sb = new StringBuilder();
        
        for(String ch : sArr){
            char current = ch.charAt(0);
            int moveCount = 0;
            
            while(moveCount < index) {
                current++; // 한 칸 앞의 알파벳으로 이동
                
                if(current > 'z') {
                    current -= 26; 
                }
                
                boolean isSkip = false;
                String currentCharStr = Character.toString(current);
                for(String skipCh : skipAlphabet){
                    if(skipCh.equals(currentCharStr)) {
                        isSkip = true;
                        break;
                    }
                }
                // 스킵 대상이 아니어야만 유효한 이동 횟수로 인정
                if(!isSkip) {
                    moveCount++;
                }
            }
            // 이동이 모두 끝난 최종 알파벳을 붙여줌
            sb.append(current);
        }
        
        return sb.toString();
    }
}