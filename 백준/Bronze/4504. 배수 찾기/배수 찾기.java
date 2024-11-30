import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		while(a != 0){
			if(a%n==0) sb.append(a).append(" is a multiple of ").append(n).append(".\n");
			else sb.append(a).append(" is NOT a multiple of ").append(n).append(".\n");
			a = Integer.parseInt(br.readLine());
		}
		System.out.println(sb.toString().trim());

	}
}