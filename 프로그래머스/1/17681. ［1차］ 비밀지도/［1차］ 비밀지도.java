class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];
        
        for(int i = 0; i< arr1.length; i++) {
            int num1 = arr1[i];
            int num2 = arr2[i];
            
            int [] bin1 = new int [n];
            int [] bin2 = new int [n];
            int j = n - 1;
            int k = n - 1;
            
            while(num1 > 0) {
                bin1[j--] = num1 % 2;
                num1 /= 2;
            }

            while(num2 > 0) {
                bin2[k--] = num2 % 2;
                num2 /= 2;
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(int x = 0; x < n; x++) {
                if(bin1[x] == 0 && bin2[x] == 0) sb.append(" ");
                else sb.append("#");
            }
            answer[i] = sb.toString();
        }
            
        return answer;
    }
}