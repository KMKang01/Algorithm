import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split("");

		int count = 0;

		for(String s: line) {
			switch(count) {
				case 0:
					if(s.equals("U")) {
						count++;
					}
					break;
				case 1:
					if(s.equals("C")) {
						count++;
					}
					break;
				case 2:
					if(s.equals("P")) {
						count++;
					}
					break;
				case 3:
					if(s.equals("C")) {
						count++;
					}
					break;
				default:
					break;
			}
		}
		//System.out.println(count);
		if (count==4) {
			System.out.println("I love UCPC");
		} else {
			System.out.println("I hate UCPC");
		}


	}
}