import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i * i <= M; i++) {
			if(i * i < N) continue;
			list.add(i * i);
		}

		if(list.size() == 0) {
			System.out.println(-1);
			return;
		}
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		System.out.println(sum+"\n"+list.get(0));
	}
}
