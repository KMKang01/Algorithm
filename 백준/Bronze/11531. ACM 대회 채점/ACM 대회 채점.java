import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, Integer> map = new HashMap<>(); // 맞은 거
		HashMap<String, Integer> map2 = new HashMap<>(); // 틀린 거
		// 제출 시각, 문제 이름, 제출 결과(통과/실패)
		// 못 푼 문제는 생각하지 않는다.

		String str = br.readLine();

		while (!str.equals("-1")) {
			String[] log = str.split(" ");

			if (log[2].equals("right")) {
				map.put(log[1], Integer.parseInt(log[0]));
				if(!map2.containsKey(log[1])){
					map2.put(log[1], 1);
				} else {
					map2.put(log[1], map2.get(log[1]) + 1);
				}
			} else {
				if (!map2.containsKey(log[1])) {
					map2.put(log[1], 1);
				} else {
					map2.put(log[1], map2.get(log[1]) + 1);
				}
			}
			str = br.readLine();
		}
		int count = 0;
		int result = 0;

		for (String s : map.keySet()) {
			count++;
			int time = map.get(s);
			int a = map2.get(s) - 1;
			result += time + a * 20;
		}
		System.out.println(count + " " + result);
	}
}