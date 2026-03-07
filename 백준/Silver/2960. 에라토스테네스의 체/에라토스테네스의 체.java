import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);

		// 2 ~ N까지의 정수 배열
		int [] arr = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			arr[i] = i + 2;
		}

//		System.out.println(Arrays.toString(arr));

		int count = 0;
		int result = 0;
		for (int i = 0; i < N - 1; i++) {
			if(arr[i] == 0) continue;
			else {
				int P = arr[i];
				arr[i] = 0;
				count++;
				if(count == K) {
					result = P;
					break;
				}
				for (int j = i + 1; j < N - 1; j++) {
					if(arr[j] != 0 && arr[j] % P == 0) {
						result = arr[j];
						arr[j] = 0;
						count++;
						if(count == K) {
							break;
						}
					}
				}
				if(count == K) {
					break;
				}
			}
		}
		System.out.println(result);
	}
}