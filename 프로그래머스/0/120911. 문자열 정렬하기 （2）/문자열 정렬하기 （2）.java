import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String [] arr = my_string.split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(String s: arr) sb.append(s);
        return sb.toString();
    }
}