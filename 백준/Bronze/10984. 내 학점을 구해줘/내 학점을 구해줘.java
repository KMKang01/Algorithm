import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T ; i++) {
			int N = Integer.parseInt(br.readLine());

			int sum = 0;
			double gradeSum = 0;
			String GPA = "";

			for (int j = 0; j < N ; j++) {
				String [] line = br.readLine().split(" ");
				int C = Integer.parseInt(line[0]);
				double G = Double.parseDouble(line[1]);

				sum += C;
				gradeSum += G * C;
			}

			GPA = String.format("%.1f", gradeSum / sum);
			sb.append(sum).append(" ").append(GPA).append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}