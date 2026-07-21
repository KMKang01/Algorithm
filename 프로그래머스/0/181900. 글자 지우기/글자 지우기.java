import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String [] strArr = my_string.split("");
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<indices.length; i++) {
            strArr[indices[i]] = "";
        }
        for(String s : strArr) {
            sb.append(s);
        }
        return sb.toString();
    }
}