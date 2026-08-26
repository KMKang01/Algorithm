class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(my_string.substring(s, e + 1)).reverse().toString();
        sb = new StringBuilder();
        System.out.println(reversed);
        sb.append(my_string.substring(0, s))
            .append(reversed)
            .append(my_string.substring(e +1));
        return sb.toString();
    }
}