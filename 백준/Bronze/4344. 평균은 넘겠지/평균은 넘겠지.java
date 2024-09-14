import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			int avg = 0;
			int count = 0;
			int students = Integer.parseInt(line[0]);
			for (int j = 1; j < line.length; j++) {
				avg += Integer.parseInt(line[j]);
			}
			avg /= students;
			for (int j = 1; j < line.length; j++) {
				if (Integer.parseInt(line[j]) > avg) {
					count++;
				}
			}
			String result = String.format("%.3f",count / (double)students * 100);
			sb.append(result).append("%\n");
		}
		System.out.println(sb.toString().trim());
	}
}