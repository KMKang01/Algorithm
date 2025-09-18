import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int maxPrize = 0;
		for (int i = 0; i < T; i++) {
			String[] line = br.readLine().split(" ");
			int[] arr = new int[6];
			for (int j = 0; j < line.length; j++) {
				arr[Integer.parseInt(line[j]) - 1]++;
			}

			int prize = 0;

			ArrayList<Integer> memory2list = new ArrayList<>();
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 4) { // 4개 일치
					prize = 50000 + (j + 1) * 5000;
					break;
				} else if (arr[j] == 3) { // 3개 일치
					prize = 10000 + (j + 1) * 1000;
					break;
				} else if (arr[j] == 2) {
					memory2list.add(j+1);
				}
			}

			if(prize == 0) {
				if(memory2list.size() == 2) {
					prize = 2000 + memory2list.get(0) * 500 + memory2list.get(1) * 500;
				} else if (memory2list.size() == 1) {
					prize = 1000 + memory2list.get(0) * 100;
				} else {
					for (int j = 0; j < arr.length; j++) {
						if (arr[j] == 1) prize = Math.max(prize, (j + 1) * 100);
					}
				}
			}

			maxPrize = Math.max(maxPrize, prize);
		}

		System.out.println(maxPrize);
	}
}