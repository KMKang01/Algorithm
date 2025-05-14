import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] s1 = br.readLine().split("");
		int answer = 0;
		for(String s: s1){
			answer += s.charAt(0) -'A' +1;
		}
		System.out.println(answer);


	}
}
