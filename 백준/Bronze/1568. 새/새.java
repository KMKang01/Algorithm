import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = 1;
		int second = 0;
		while(N > 0){
			if(N < K)
				K=1;
			N -= K;
			K++;
			second++;
		}
		System.out.println(second);
	}
}