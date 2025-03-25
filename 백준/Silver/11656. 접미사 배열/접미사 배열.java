import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();

		List<String> sList = new ArrayList<>();

		int count = line.length() - 1;
		while ( 0 <= count) {
			sList.add(line.substring(count--)) ;
		}
		Collections.sort(sList);

		for(String s: sList) {
			sb.append(s).append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}