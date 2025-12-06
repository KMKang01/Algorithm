import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		while (!(line = br.readLine()).equals("end")) {
			switch (line) {
				case "animal":
					sb.append("Panthera tigris\n");
					break;
				case "flower":
					sb.append("Forsythia koreana\n");
					break;
				case "tree":
					sb.append("Pinus densiflora\n");
					break;
			}
		}
		System.out.print(sb);
	}
}