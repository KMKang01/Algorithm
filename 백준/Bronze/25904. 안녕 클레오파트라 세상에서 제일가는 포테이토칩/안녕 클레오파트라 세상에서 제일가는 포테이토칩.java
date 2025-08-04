import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input  = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int X = Integer.parseInt(input[1]);

		String [] tarrs = br.readLine().split(" ");
		int i = 0;

		while(Integer.parseInt(tarrs[i]) >= X) {
			i = (i + 1) % N;
			X++;
		}

		System.out.println(i+1);
	}
}
