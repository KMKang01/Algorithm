import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        myStr = myStr.replace("a", "_");
        myStr = myStr.replace("b", "_");
        myStr = myStr.replace("c", "_");
        String [] arr = myStr.split("_");
        
        ArrayList<String> list = new ArrayList<>();
        for(String s: arr) if(!s.equals("")) list.add(s);
        arr = list.stream().map(i -> (String) i).toArray(String[]::new);
        if(arr.length == 0) {
            arr = new String[]{"EMPTY"};
        }
        
        
        
        return arr;
    }
}