import java.io.*;
import java.util.*;

public class Main {
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			sb.append(isPalindrome(br.readLine())).append(" ").append(count).append("\n");
			count = 0;
		}

		System.out.println(sb.toString().trim());
	}

	public static int recursion(String s, int l, int r){
		count++;
		if(l >= r) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else return recursion(s, l + 1, r - 1);
	}
	public static int isPalindrome(String s){
		return recursion(s, 0, s.length()-1);
	}
}