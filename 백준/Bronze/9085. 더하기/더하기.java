import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T ; i++) {
			br.readLine();
			int sum = 0;
			String [] s = br.readLine().split(" ");
			for(String str: s){
				sum += Integer.parseInt(str);
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb.toString().trim());
	}
}