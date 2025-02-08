import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(sb1.append(num1).reverse().toString());

			String [] num3 = Integer.toString(num1+num2).split("");
			boolean isReversed = true;
			for (int j = 0; j < num3.length / 2 ; j++) {
				if(!num3[j].equals(num3[num3.length- j - 1])) isReversed = false;
			}
			if(isReversed) sb2.append("YES\n");
			else sb2.append("NO\n");
			sb1 = new StringBuilder();
		}
		System.out.println(sb2.toString().trim());
	}
}


