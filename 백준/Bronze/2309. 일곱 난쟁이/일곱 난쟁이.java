import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int [] arr = new int [9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += num;
		}
		Arrays.sort(arr);
		int i = 0;
		int j = 1;
		while (!(sum-arr[i]-arr[j]==100)) {
			j++;
			if (j==9) {
				i++;
				j=i+1;
			}
		}
		for (int k = 0; k < 9; k++) {
			if (k!=i && k!=j) {
				sb.append(arr[k]).append('\n') ;
			}
		}

		System.out.print(sb);
	}
}