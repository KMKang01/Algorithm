import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		switch (N) {
			case 1:
				sb.append("12 ");
				break;
			case 2, 3:
				sb.append("11 ");
				break;
			case 4:
				sb.append("10 ");
				break;
			case 5, 6, 7:
				sb.append("9 ");
				break;
			case 8:
				sb.append("8 ");
				break;
			case 9:
				sb.append("7 ");
				break;
			case 10, 11:
				sb.append("6 ");
				break;
		}

		switch (N) {
			case 1:
				sb.append("1600");
				break;
			case 2:
				sb.append("894");
				break;
			case 3:
				sb.append("1327");
				break;
			case 4:
				sb.append("1311");
				break;
			case 5:
				sb.append("1004");
				break;
			case 6:
				sb.append("1178");
				break;
			case 7:
				sb.append("1357");
				break;
			case 8:
				sb.append("837");
				break;
			case 9:
				sb.append("1055");
				break;
			case 10:
				sb.append("556");
				break;
			case 11:
				sb.append("773");
				break;
		}

		System.out.println(sb.toString());

	}
}

