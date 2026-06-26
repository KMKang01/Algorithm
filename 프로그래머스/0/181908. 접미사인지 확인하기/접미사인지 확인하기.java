class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        boolean flag = true;

        int j = 1;
        int i = is_suffix.length() - 1;
        
        if(my_string.length() < is_suffix.length()) {
            flag = false;
        } else {
            while(i >= 0) {
            System.out.println(my_string.charAt(my_string.length() - j)+" "+is_suffix.charAt(i));
            System.out.println(my_string.charAt(my_string.length() - j) != is_suffix.charAt(i));
            if(my_string.charAt(my_string.length() - j) != is_suffix.charAt(i)) {
                flag = false;
                break;
            }
            System.out.println(i);
            i--;
            j++;
        }
        
        }
        
        return flag?1:0;
    }
}