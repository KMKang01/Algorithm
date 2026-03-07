class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int gcd = 0;
        int lcm = 0;
        int n1 = n;
        int m1 = m;
        int tmp = 0;
        if(n >= m) {
            while(m1 != 0) {
                tmp = n1 % m1;
                n1 = m1;
                m1 = tmp;
            }
            gcd = n1;

        } else {
            while(n1 != 0) {
                tmp = m1 % n1;
                m1 = n1;
                n1 = tmp;
            }
            gcd = m1;

        }

        lcm = m * n / gcd;

        answer = new int[]{gcd, lcm};
        
        return answer;
    }
}