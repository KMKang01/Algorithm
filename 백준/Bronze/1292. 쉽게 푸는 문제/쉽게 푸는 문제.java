import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		int[] arr = new int[1000];

		int cnt = 1;
		for (int i = 0; i < 1000; ) {
			for (int j = 0; j < cnt; j++) {
				if(i > 999) break;
				arr[i++] = cnt;
			}
			cnt++;
		}
		int sum = 0;

		for( int i = a -1 ; i <= b - 1 ; i++ ) {
			sum += arr[i ];
		}

		System.out.println(sum);
	}
}