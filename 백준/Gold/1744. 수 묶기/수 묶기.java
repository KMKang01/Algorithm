import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;

		ArrayList<Short> positive = new ArrayList<>();
		ArrayList<Short> negativeAnd0 = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			short a = Short.parseShort(br.readLine());
			if (a > 0) positive.add(a);
			else negativeAnd0.add(a);
		}

		positive.sort(Comparator.reverseOrder());
		negativeAnd0.sort(Comparator.naturalOrder());

		/*
			양수 배열에서 큰 수 = a, 작은 수 = b일 때
			a * b >= a + b -> a * b
			a * b < a + b -> a + b
			이때, 다음 수가 없으면 result에 a를 바로 더함

			0을 포함한 음수 배열에서 더 작은 수 = a, 다음으로 작은 수 = b일 때 (둘 다 0이 아님)
			a * b
			다음 수가 없으면 result에 a를 바로 더함
			이때, b = 0인 경우 a * b = 0이므로 연산하지 않음.
		*/

		while (!positive.isEmpty()) {
			short a = positive.remove(0);
			if (positive.isEmpty()) {
				result += a;
			} else {
				short b = positive.remove(0);
				if (a * b >= a + b) result += a * b;
				else result += a+ b;
			}
		}
		while(!negativeAnd0.isEmpty()) {
			short a = negativeAnd0.remove(0);
			if (negativeAnd0.isEmpty()) {
				result += a;
			} else {
				short b = negativeAnd0.remove(0);
				result += a * b;
			}
		}
		System.out.println(result);
	}


}