class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(Character.toString(s.charAt(i)));
            } else {
                String s3 = s.substring(i, Math.min(i + 3, s.length()));
                String s4 = s.substring(i, Math.min(i + 4, s.length()));
                String s5 = s.substring(i, Math.min(i + 5, s.length()));
                switch(s3) {
                    case "one" : sb.append("1"); break;
                    case "two" : sb.append("2"); break;
                    case "six" : sb.append("6"); break;
                }
                
                switch(s4) {
                    case "zero" : sb.append("0"); break;
                    case "four" : sb.append("4"); break;
                    case "five" : sb.append("5"); break;
                    case "nine" : sb.append("9"); break;
                }
                
                switch(s5) {
                    case "three" : sb.append("3"); break;
                    case "seven" : sb.append("7"); break;
                    case "eight" : sb.append("8"); break;
                }
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}