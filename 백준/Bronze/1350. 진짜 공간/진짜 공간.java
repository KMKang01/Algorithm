import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		ArrayList<Integer> a = new ArrayList<>();
		String [] files = br.readLine().split(" ");
		for (int i = 0; i < T; i++) {
			a.add(Integer.parseInt(files[i]));
		}
		int clusters = Integer.parseInt(br.readLine());

		long sum = 0;
		for(int i: a) {
			if(i == 0) continue;
			if(i <= clusters) {
				sum += clusters;
			} else {
				sum += (long) Math.ceil((double)i / clusters) * clusters;
			}
		}
		System.out.println(sum);
	}
}