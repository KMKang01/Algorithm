import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = "";
		while(!line.equals("0 0")) {
			line = br.readLine();
			if (line.equals("0 0")) break;
			int A = Integer.parseInt(line.split(" ")[0]);
			int B = Integer.parseInt(line.split(" ")[1]);
			sb.append(A+B).append("\n");
		}
		System.out.println(sb.toString().trim());



	}
}