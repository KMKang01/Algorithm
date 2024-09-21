import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			if(map.containsKey(input[1])){
				map.get(input[1]).add(input[0]);
			} else {
				map.put(input[1], new ArrayList<>());
				map.get(input[1]).add(input[0]);
			}
		}

		int count = 0;

		for(Map.Entry<String, ArrayList<String>> a: map.entrySet()){
			if(a.getValue().size() == 2 && !a.getKey().equals("-")){
				count++;
				sb.append(a.getValue().get(0))
						.append(" ")
						.append(a.getValue().get(1))
						.append("\n");
			}
		}
		sb.insert(0, count+"\n");
		System.out.println(sb.toString().trim());
	}
}