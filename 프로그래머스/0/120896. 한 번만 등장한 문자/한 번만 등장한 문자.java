class Solution {
    public String solution(String s) {
        String answer = "";
        int [] arr = new int [26];
        for(String c : s.split("")) {
            arr[c.charAt(0) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i : arr) {
            if(i == 1) sb.append((char)('a'+idx));
            idx++;
        }
        return sb.toString();
    }
}