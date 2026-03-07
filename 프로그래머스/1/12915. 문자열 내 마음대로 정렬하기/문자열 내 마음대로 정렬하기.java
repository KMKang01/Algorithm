import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        // n번째 인덱스의 문자를 기준으로 정렬
        // n번째 인덱스의 문자가 같은 경우 나머지 문자열을 기준으로 사전순 정렬
        HashMap<Character, ArrayList<String>> map = new HashMap<>();
        for(int i = 0 ; i < strings.length; i++) {
            char ch = strings[i].charAt(n);
            if(map.get(ch) == null) {
                ArrayList<String> list = new ArrayList<>();
                list.add(strings[i]);
                map.put(strings[i].charAt(n), list);
            } else {
                ArrayList<String> list = map.get(ch);
                list.add(strings[i]);
                map.put(ch, list);
            }            
        }
        
        ArrayList<Character> list = new ArrayList<>();
        for(Object o : map.keySet().toArray()){
            list.add((Character) o);
        }
        
        ArrayList<String> result = new ArrayList<>();
        Collections.sort(list);
        for(Character ch : list) {
            List<String> tmp = map.get(ch);
            Collections.sort(tmp);
            result.addAll(tmp);
        }
        
        answer = new String[result.size()];
        for(int i = 0; i < result.size() ; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}