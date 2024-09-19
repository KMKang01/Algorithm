import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String [] students = br.readLine().split(" ");
		HashMap<String, Integer> studentMap = new HashMap<>();

		for (String s : students) {
			studentMap.put(s, 0);
		}

		for (int i = 0; i < N; i++) {
			String[] likes = br.readLine().split(" ");
			for (String s : likes) {
				studentMap.put(s, studentMap.get(s) + 1);
			}
		}

		List<String> keys = new ArrayList<>(studentMap.keySet());
		keys.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int a = studentMap.get(o1);
				int b = studentMap.get(o2);
				if(a > b) return -1;
				else if(a < b) return 1;
				else {
					return o1.compareTo(o2);
				}
			}
		});

		for(String s : keys) {
			sb.append(s).append(" ").append(studentMap.get(s)).append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}