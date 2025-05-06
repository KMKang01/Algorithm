import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ab = br.readLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		int count = 0;

		int closest = 0;
		for (int num : list) {
			if (num == b) {
				count++;
				break;
			} else if (Math.abs(a - b) > Math.abs(num - b)) {
				if(closest == 0) {
					closest = num;
				} else {
					if(Math.abs(closest - b) > Math.abs(num - b)) {
						closest = num;
					}
				}
			}
		}

		if (count == 1) {
			System.out.println(count);
		} else {
			if(closest == 0) {
				count = Math.abs(a- b);
			} else {
				count++;
				if (closest > b) {
					count += closest - b;
				} else {
					count += b - closest;
				}
			}

			System.out.println(count);
		}
	}
}

