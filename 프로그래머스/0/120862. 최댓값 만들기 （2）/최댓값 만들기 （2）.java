import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int a: numbers) list.add(a);
        Collections.sort(list);
        int m1 = list.get(0) * list.get(1);
        int m2 = list.get(list.size() - 1) * list.get(list.size() - 2);
        return Math.max(m1, m2);
    }
}