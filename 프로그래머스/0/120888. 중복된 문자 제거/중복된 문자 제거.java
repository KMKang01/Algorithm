import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<String> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        String [] splits = my_string.split("");
        for(int i = 0 ; i < my_string.length(); i++) {
            set.add(splits[i]);
            // System.out.println(set);
        }
        
        for(String s : set) sb.append(s);
        
        return sb.toString();
    }
}