import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String [] str = br.readLine().split(" ");
		double V = 0;
		for(String s: str) {
			V = 1 - (1 - V) *( 1 - Double.parseDouble(s) * 0.01);
			sb.append( String.format("%f", V * 100)).append("\n");
		}
		System.out.println(sb.toString().trim());

	}
}
