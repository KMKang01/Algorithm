class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sideA = sides[0];
        int sideB = sides[1];
                
        int maxSide = Math.max(sideA, sideB);
        int minSide = Math.min(sideA, sideB);
        int sideC1 = maxSide; // sides의 두 변보다 긴 경우
        int sideC2 = maxSide; // sides의 두 변 중 한 변이 가장 긴 경우

        while((sideC1 + 1) < sideA + sideB) {
            sideC1++;
            System.out.println(sideC1);
            answer++;
        }
        
        while(minSide + (sideC2 - 1) >= maxSide) {
            sideC2--;
            System.out.println(sideC2);
            answer++;
        }
        
        return answer;
    }
}