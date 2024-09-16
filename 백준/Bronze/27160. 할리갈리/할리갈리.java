import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			String fruit = line[0];
			int count = Integer.parseInt(line[1]);
			if (map.containsKey(fruit)) {
				map.put(fruit, map.get(fruit)+count);
			} else {
				map.put(fruit, count);
			}
		}

		boolean bell = false;

		for(String fruit : map.keySet()) {
			if(map.get(fruit) == 5) {
				bell = true;
				break;
			}
		}

		if(bell) System.out.println("YES");
		else System.out.println("NO");

	}
}