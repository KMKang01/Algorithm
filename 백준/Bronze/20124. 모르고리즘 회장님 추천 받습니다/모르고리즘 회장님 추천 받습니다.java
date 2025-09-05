import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Map<String , Integer> map = new HashMap<>();
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split(" ");
			String name = line[0];
			int votes = Integer.parseInt(line[1]);
			max = Math.max(max, votes);
			map.put(line[0], Integer.parseInt(line[1]));
		}

		ArrayList<String> list = new ArrayList<>();
		for( Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == max) {
				list.add(entry.getKey());
			}
		}

		Collections.sort(list);
		System.out.println(list.get(0));
	}


}
