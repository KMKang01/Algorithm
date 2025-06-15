import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] input = br.readLine().split(" ");
		int J = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		int count = 0;
		for (int i = 0; i < N ; i++) {
			String [] line = br.readLine().split("");
			int sum = 0;
			for(String s: line) {
				if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) >= '0' && s.charAt(0) <= '9') {
					sum += 2;
				} else if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
					sum += 4;
				} else if (s.charAt(0) == ' ') {
					sum += 1;
				}
			}
			if(sum <= J) count++;
		}
		System.out.println(count);
	}
}


