import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				sb.append(i* M + (j+1)).append(" ");
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}