import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		while(!(line = br.readLine()).equals("0 0 0")) {
			String [] inputs = line.split(" ");
			int M = Integer.parseInt(inputs[0]);
			int A = Integer.parseInt(inputs[1]);
			int B = Integer.parseInt(inputs[2]);

			double train = (double) M / A; // train Hour
			double plane = (double) M / B; // plain Hour

			BigDecimal gaps = new BigDecimal(Double.toString(train)).subtract(new BigDecimal(Double.toString(plane)));
			double gap = gaps.doubleValue();

			int time = (int) Math.round(gap * 3600);
			int hour = time / 3600;
			int min = (time % 3600) / 60;
			int sec = time % 60;

			sb.append(hour)
					.append(":")
					.append(min < 10 ? "0" + min : min)
					.append(":")
					.append(sec < 10 ? "0" + sec : sec)
					.append("\n");
		}
		System.out.print(sb.toString().trim());
	}
}