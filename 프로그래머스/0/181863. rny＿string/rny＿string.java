class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        for (String a: rny_string.split("")){
            if(a.equals("m")) sb.append("rn");
            else sb.append(a);
        }
        
        return sb.toString();
    }
}