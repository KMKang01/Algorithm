class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String bab : babbling) {
            String prevWord = "";
            boolean [] isRight = new boolean[bab.length()];
            
            for(int i = 0; i < bab.length(); i++) {
                if(bab.substring(i, Math.min(i + 3, bab.length())).equals("aya")) {                    
                    if(prevWord.equals("aya")) break;
                    isRight[i] = isRight[i + 1] = isRight[i + 2] = true;
                    i += 2;
                    prevWord = "aya";
                } else if (bab.substring(i, Math.min(i + 2, bab.length())).equals("ye")) {
                    if(prevWord.equals("ye")) break;
                    isRight[i] = isRight[i + 1] = true;
                    i += 1;
                    prevWord = "ye";
                } else if(bab.substring(i,Math.min(i + 3, bab.length())).equals("woo")) {
                    if(prevWord.equals("woo")) break;
                    isRight[i] = isRight[i + 1] = isRight[i + 2] = true;
                    i += 2;
                    prevWord = "woo";
                } else if (bab.substring(i, Math.min(i + 2, bab.length())).equals("ma")) {
                    if(prevWord.equals("ma")) break;
                    isRight[i] = isRight[i + 1] = true;
                    i += 1;
                    prevWord = "ma";
                }
            }
            
            boolean flag = true;
            for(int i = 0; i < isRight.length; i++) {
                if(!isRight[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
        
        return answer;
    }
}