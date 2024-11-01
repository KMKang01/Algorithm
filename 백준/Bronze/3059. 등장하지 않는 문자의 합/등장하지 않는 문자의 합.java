import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
	static final int SUMOFALPHABETS = 2015;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<>();

		for (int i = 0; i < n ; i++) {
			String [] line = br.readLine().split("");
			int sum = 0;
			for(String a: line){
				if(!arr.contains(a)){
					arr.add(a);
					sum += a.charAt(0);
				}
			}

			sb.append(SUMOFALPHABETS - sum).append("\n");
			arr = new ArrayList<>();
		}
		System.out.print(sb.toString().trim());
	}
}