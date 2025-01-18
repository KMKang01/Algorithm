import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			String line = br.readLine();
			int num = Integer.parseInt(line);
			if(!map.containsKey(line)) {
				map.put(line, 1);
			} else {
				map.put(line, map.get(line)+1);
			}
			sum += num;
		}
		int maxFreq = 0;
		String maxFreqLine = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > maxFreq) {
				maxFreq = entry.getValue();
				maxFreqLine = entry.getKey();
			}
		}
		System.out.println(sum/10 + "\n" + maxFreqLine);
	}
}