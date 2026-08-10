import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        // 소문자 / 대문자 / 숫자 순으로 정렬
        int [] s1Arr = new int[62];
        int [] s2Arr = new int[62];
        
        for(String s : s1.split("")) {
            s1Arr[returnIndex(s)]++;
        }
        for(String s : s2.split("")) {
            s2Arr[returnIndex(s)]++;
        }

        boolean flag = true;
        for(int i = 0; i < s1Arr.length; i++) {
            if(s1Arr[i] != s2Arr[i]) {
                flag = false;
                break;
            }
        }
        System.out.print(flag?"Yes":"No");
    }

    public static int returnIndex(String s) {
        char c = s.charAt(0);
        if( c >= 'a' && c <= 'z') {
            return c - 'a';
        } else if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 26;
        } else {
            return c - '0' + 52;
        }
    }
}