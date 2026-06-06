class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String [] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        switch(arr[1]) {
            case "+": answer = a+b;break;
                case "-": answer = a-b;break;
                case "*": answer = a*b;break;
        }
        return answer;
    }
}