class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int a : num_list){
            if(a % 2 == 0 ) sb1.append(a);
            else sb2.append(a);
        }
        int answer = 0;
        int even = Integer.parseInt(sb1.toString());
        int odd = Integer.parseInt(sb2.toString());
        
        return even + odd;
        
    }
}