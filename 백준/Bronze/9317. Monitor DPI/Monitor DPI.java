import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		while(!line.equals("0 0 0")) {
			String [] parts = line.split(" ");
			double D = Double.parseDouble(parts[0]);
			int RH = Integer.parseInt(parts[1]);
			int RV = Integer.parseInt(parts[2]);
			double W = 16 * D / Math.sqrt(337);
			double H = 9 * W / 16;

			double DPIH = RH / W;
			double DPIV = RV / H;

			sb.append("Horizontal DPI: ").append(String.format("%.2f", (DPIH))).append("\n");
			sb.append("Vertical DPI: ").append(String.format("%.2f", (DPIV))).append("\n");

			line = br.readLine();
		}
		System.out.println(sb.toString().trim());
	}
}
