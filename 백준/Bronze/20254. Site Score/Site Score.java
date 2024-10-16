import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] lines = br.readLine().split(" ");
		int sum = 0;
		int [] arr = new int[lines.length];
		arr[0] = 56;
		arr[1] = 24;
		arr[2] = 14;
		arr[3] = 6;
		for (int i = 0; i < lines.length; i++) {
			sum += Integer.parseInt(lines[i]) * arr[i];
		}
		System.out.println(sum);
	}
}

