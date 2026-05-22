class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String swp = "";
        String [] arr = my_string.split("");
        swp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = swp;
        
        StringBuilder sb = new StringBuilder();
        for(String s: arr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}