import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		int[] arrA = new int[N];
		int[] arrB = new int[N];


		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			arrA[i] = A;
			arrB[i] = B;
		}

		int ground = 0;
		int elevator = 0;
		for (int i = 0; i < N; i++) {
			ground += arrA[i];
			elevator += arrB[i];
			sb.append(ground - elevator).append("\n");
		}
		System.out.println(sb.toString().trim());



	}
}