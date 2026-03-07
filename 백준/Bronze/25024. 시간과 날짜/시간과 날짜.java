import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);

			if ((x >= 0 && x <= 23) && (y >= 0 && y <= 59)) {
				sb.append("Yes ");
			} else {
				sb.append("No ");
			}

			switch (x) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (y >= 1 && y <= 31)
						sb.append("Yes").append("\n");
					else
						sb.append("No").append("\n");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (y >= 1 && y <= 30)
						sb.append("Yes").append("\n");
					else
						sb.append("No").append("\n");
					break;
				case 2:
					if (y >= 1 && y <= 29)
						sb.append("Yes").append("\n");
					else
						sb.append("No").append("\n");
					break;
				default:
					sb.append("No").append("\n");
					break;
			}
		}

		System.out.print(sb);

	}
}