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
				sb.append("11\n");
				break;
			case 2, 3, 4:
				sb.append("9\n");
				break;
			case 5, 6, 7, 8, 9, 10:
				sb.append("8\n");
				break;
		}

		sb.append("A");
		switch (N) {
			case 1:
				sb.append(" B C D E F G H J");
				break;
			case 2, 3:
				sb.append(" C E F G H I");
				break;
			case 4:
				sb.append(" B C E F G H");
				break;
			case 5, 6, 7, 8, 9:
				sb.append(" C E F G H");
				break;
			case 10:
				sb.append(" B C F G H");
				break;
		}
		sb.append(" L M");

		System.out.println(sb.toString());

	}
}

