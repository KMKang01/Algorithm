import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		StringBuilder sb = new StringBuilder();

		int countOfZero = 0;
		switch (num.length() % 3) {
			case 1:
				sb.append("00").append(num);
				break;
			case 2:
				sb.append("0").append(num);
				break;
			default:
				sb.append(num);
		}
		num = sb.toString();
		int count = num.length() / 3; // 자릿수
		sb = new StringBuilder();

		for (int i = count; i > 0; i--) {
			String convert = num.substring((i - 1) * 3, i * 3);
			switch (convert) {
				case "000":
					sb.append("0");
					break;
				case "001":
					sb.append("1");
					break;
				case "010":
					sb.append("2");
					break;
				case "011":
					sb.append("3");
					break;
				case "100":
					sb.append("4");
					break;
				case "101":
					sb.append("5");
					break;
				case "110":
					sb.append("6");
					break;
				case "111":
					sb.append("7");
					break;
			}
		}
		System.out.println(sb.reverse().toString());

	}
}


