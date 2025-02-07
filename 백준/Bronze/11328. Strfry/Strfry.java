import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split(" ");
			ArrayList<String> a = new ArrayList<>();
			for(String x : line[0].split("")){
				a.add(x);
			}
			String [] b = line[1].split("");
			boolean isPossible = true;
			if(a.size() != b.length) {
				isPossible = false;
			}

			for (int j = 0; j < b.length; j++) {
				if(!isPossible) break;
				if(!a.contains(b[j])){
					isPossible = false;
					break;
				} else {
					a.remove(b[j]);
				}
			}

			if(isPossible){
				sb.append("Possible\n");
			} else {
				sb.append("Impossible\n");
			}

		}
		System.out.println(sb.toString().trim());

	}
}