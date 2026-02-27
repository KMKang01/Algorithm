class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            int num = food[i];
            if(num % 2 == 0) {
                for(int j = 0; j < num / 2; j++) sb.append(i);
            } else {
                for(int j = 0; j <( num - 1 ) /2; j++) sb.append(i);
            }
        }
        String tmp = sb.toString();
        String tmp2 = sb.reverse().toString();
        
        answer = tmp + "0" + tmp2;
        
        return answer;
    }
}


