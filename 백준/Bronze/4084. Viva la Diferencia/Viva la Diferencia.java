import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		while (!(line = br.readLine()).equals("0 0 0 0")) {
			String[] parts = line.split(" ");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			int c = Integer.parseInt(parts[2]);
			int d = Integer.parseInt(parts[3]);

			int ab, bc, cd, da = 0;
			int count = 0;
			while(!(a == b && b == c && c == d)) {
				ab = Math.abs(a - b);
				bc = Math.abs(b - c);
				cd = Math.abs(c - d);
				da = Math.abs(d - a);
				a = ab;
				b = bc;
				c = cd;
				d = da;

				count++;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb.toString());
	}
}