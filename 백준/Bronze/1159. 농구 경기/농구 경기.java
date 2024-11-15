import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int ['z'-'a' + 1];
		for (int i = 0; i < N; i++) {
			String firstName = String.valueOf(br.readLine().charAt(0));
			arr[firstName.charAt(0)-97]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=5) sb.append((char)(i+97));
		}
		if(!sb.isEmpty()) System.out.println(sb);
		else System.out.println("PREDAJA");


	}
}