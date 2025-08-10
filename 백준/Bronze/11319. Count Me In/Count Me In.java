import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String [] input = br.readLine().split("");

			int vowels = 0;
			int consonants = 0;
			for(String ch : input) {
				if(ch.matches("[AEIOUaeiou]")) {
					vowels++;
				} else if( ch.equals(" ")){
					continue;
				} else {
					consonants++;
				}
			}

			sb.append(consonants).append(" ").append( vowels).append('\n');
		}

		System.out.print(sb.toString().trim());
	}
}
