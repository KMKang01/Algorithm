class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cost = 0;
        long requiredMoney = money;
        
        for(int i = 1; i <= count ; i++) {
            cost += price * i;
            requiredMoney -= price * i;
        }
        System.out.println(money);
        if(requiredMoney >= 0) return 0;
        else return Math.abs(requiredMoney);
    }
}