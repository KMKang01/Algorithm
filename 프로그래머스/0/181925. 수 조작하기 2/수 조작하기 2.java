class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int prev = numLog[0];

        for(int i = 1; i < numLog.length; i++) {
            int now = numLog[i];
            switch(now - prev) {
                case 1:
                    sb.append("w");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case -10:
                    sb.append("a");
                    break;
            }
            prev = now;
        }
        
        return sb.toString();
    }
}