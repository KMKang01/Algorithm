import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int [] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int leftCnt = 1;
		int leftMax = arr[0];
		for (int i = 1; i < N ; i++) {
			if(arr[i] > leftMax) {
				leftMax = arr[i];
				leftCnt++;
			}
		}
		int rightCnt = 1;
		int rightMax = arr[N - 1];
		for (int i = N - 1 ; i >= 0 ; i--) {
			if(arr[i] > rightMax) {
				rightMax = arr[i];
				rightCnt++;
			}
		}
		System.out.printf("%d\n%d", leftCnt, rightCnt);
	}
}