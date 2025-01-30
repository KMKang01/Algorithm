import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		/*
			s = t^2
			d >= s + t
		*/

		for (int i = 0; i < T; i++) {
			int d = Integer.parseInt(br.readLine());
			int t = 0;
			while((t+1)*(t+2) <= d){
				t++;

			}
			System.out.println(t);
		}

	}
}