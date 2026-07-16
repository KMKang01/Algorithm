class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        while(age > 0) {
            char n = (char)(age % 10 + 'a');
            sb.append(n);
            age /= 10;
        }
        
        return sb.reverse().toString();
    }
}