import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split("");

		int sum = 0;
		int remem = 0;
		for (int i = 0; i < input.length; i++) {
			if(input[i].matches("[0-9]")){
				if(i % 2 ==0) sum += Integer.parseInt(input[i]);
				else sum += Integer.parseInt(input[i]) * 3;
			} else {
				remem = i % 2 == 0 ? 1 : 3;
			}
		}

		// ((sum + remem * m) % 10) - 10 = 0
		// -> sum + remem * m == 10의배수
		int m = 0;
		while ((sum + remem * m) % 10 != 0) {
			m++;
		}
		System.out.println(m);
	}
}


