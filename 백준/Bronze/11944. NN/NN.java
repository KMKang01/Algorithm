import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] input = br.readLine().split(" ");
		String N = input[0];
		String M = input[1];

		for (int i = 0; i < Integer.parseInt(N); i++) {
			sb.append(N);
		}

		if(sb.toString().length() >= Integer.parseInt(M)) {
			System.out.println(sb.substring(0, Integer.parseInt(M)));
		} else {
			System.out.println(sb.toString());
		}


	}
}

