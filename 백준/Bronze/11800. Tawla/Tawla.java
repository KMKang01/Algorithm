import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Map<Integer, String> ordinaryMap = new HashMap<>();
		ordinaryMap.put(1, "Yakk");
		ordinaryMap.put(2, "Doh");
		ordinaryMap.put(3, "Seh");
		ordinaryMap.put(4, "Ghar");
		ordinaryMap.put(5, "Bang");
		ordinaryMap.put(6, "Sheesh");

		Map<Integer, String> specialMap = new HashMap<>();
		specialMap.put(1, "Habb Yakk");
		specialMap.put(2, "Dobara");
		specialMap.put(3, "Dousa");
		specialMap.put(4, "Dorgy");
		specialMap.put(5, "Dabash");
		specialMap.put(6, "Dosh");

		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			String [] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			sb.append("Case ").append(t).append(": ");
			if(a == b ){
				sb.append(specialMap.get(a)).append("\n");
			} else if(a == 6 && b == 5 || a == 5 && b == 6) {
				sb.append("Sheesh Beesh").append("\n");
			} else {
				
				sb.append(ordinaryMap.get(Math.max(a, b))).append(" ").append(ordinaryMap.get(Math.min(a,b))).append("\n");
			}
		}
		System.out.print(sb.toString());

	}
}