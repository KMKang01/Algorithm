import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		/*
		 * 1의 자리인 경우 -> 모두 한수
		 * 10의 자리인 경우 -> 모두 한수
		 * 100의 자리인 경우
		 * i) 차이가 0
		 * 111, 222, 333, 444, 555, 666, 777, 888, 999
		 *
		 * ii) 증가하는 등차수열
		 * 123, 135, 147, 159
		 * 234, 246, 258
		 * 345, 357, 369
		 * 456, 468
		 * 567, 579
		 * 678
		 * 789
		 *
		 * iii) 감소하는 등차수열
		 * 987, 975, 963, 951
		 * 876, 864, 852, 840
		 * 765, 753, 741
		 * 654, 642, 630
		 * 543, 531
		 * 432, 420
		 * 321
		 * 210
		 * */

		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (i < 100) count++; // 1~99 는 모두 한수
			else {
				// 1. 공차가 0인 경우
				int hundreds = i / 100;
				int tens = (i / 10) % 10;
				int units = i % 10;
				if (hundreds == tens && tens == units) count++;
					// 2. 공차가 양수인 경우
				else if ((tens - hundreds) == (units - tens) && (tens - hundreds) > 0) count++;
					// 3. 공차가 음수인 경우
				else if ((tens - hundreds) == (units - tens) && (tens - hundreds) < 0) count++;

			}
		}
		System.out.println(count);
	}
}