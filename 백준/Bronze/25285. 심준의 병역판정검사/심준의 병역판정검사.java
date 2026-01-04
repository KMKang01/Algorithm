import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N  = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			String line [] = br.readLine().split(" ");
			double height = Integer.parseInt(line[0]);
			double weight = Integer.parseInt(line[1]);
			double bmi = weight / ((height / 100) * (height / 100));

			if(height < 140.1) {
				sb.append(6).append("\n");
			} else if (height < 146) {
				sb.append(5).append("\n");
			} else if (height < 159) {
				sb.append(4).append("\n");
			} else if (height < 161) {
				if(bmi >= 16.0 && bmi < 35.0) {
					sb.append(3).append("\n");
				} else {
					sb.append(4).append("\n");
				}
			} else if (height < 204) {
				if(bmi >= 20.0 && bmi < 25.0) {
					sb.append(1).append("\n");
				} else if (bmi >= 18.5 && bmi < 30.0) {
					sb.append(2).append("\n");
				} else if (bmi >= 16.0 && bmi < 35.0) {
					sb.append(3).append("\n");
				} else {
					sb.append(4).append("\n");
				}
			} else {
				sb.append(4).append("\n");
			}
		}

		System.out.print(sb);
	}
}