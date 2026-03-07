class Solution {
    public long solution(long n) {
        long answer = 0;
        long tmp = n;
        int digits = 0;
        StringBuilder sb = new StringBuilder();
        
        while(tmp > 0) {
            tmp /= 10;
            digits++;
        }
        
        long [] arr = new long[digits];
        for(int i = 0; i < digits; i++) {
            arr[i] = n % 10;
            // System.out.println(arr[i]);
            n /= 10;
        }
        
        long max = -1;
        while(sb.length() < digits) {
            int index = 0;
            for(int i = 0; i < digits; i++) {
                if( max < arr[i] ) {
                    max = arr[i];
                    index = i;
                }
            }   
            arr[index] = -1;
            sb.append(max);
            max = -1;
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}