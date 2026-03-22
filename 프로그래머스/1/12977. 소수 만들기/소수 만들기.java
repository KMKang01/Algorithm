class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 최대 합 = 2997
        // 2997까지의 소수를 에라토스테네스의 체를 이용하여 먼저 배열을 만들고 확인
        boolean [] isPrime = new boolean[2998]; // 0 ~ 2997
        
        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true; // boolean배열의 default값은 false이므로 true로 바꿔주기
        }
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i <= Math.sqrt(2997); i++) {
            if(isPrime[i]) {
                for(int j = i*i; j <= 2997; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        
        // 최대 50C3의 케이스를 isPrime = true인지 확인
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1;j++) {
                for(int k = j + 1; k < nums.length; k++) {
    //                    System.out.println(nums[i] +" " + nums[j] + " "+ nums[k]);
                   // System.out.print(nums[i] + nums[j] + nums[k]);
                   //  System.out.println(isPrime[nums[i] + nums[j] + nums[k]]);
                    if(isPrime[nums[i] + nums[j] + nums[k]]) answer++;
                }
            }
        }
        

        
        
        return answer;
    }
}