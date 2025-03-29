import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] line = br.readLine().split(":");

		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);

		int min = Math.min(n, m);

		for (int i = min; i > 0 ; i--) {
			if(m%i == 0 && n%i == 0){
				n /= i;
				m /= i;
				break;
			}
		}
		System.out.printf("%d:%d", n,m);
	}
}


