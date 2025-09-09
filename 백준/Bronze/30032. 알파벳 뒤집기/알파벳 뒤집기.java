import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int D = Integer.parseInt(line[1]);

		for (int i = 0; i < N; i++) {
			String [] line2 = br.readLine().split("");
			switch(D){
				case 1:
					for (int j = 0; j < line2.length; j++) {
						switch(line2[j]){
							case "d": sb.append("q"); break;
							case "b": sb.append("p"); break;
							case "q": sb.append("d"); break;
							case "p": sb.append("b"); break;
						}
					}
					break;
				case 2:
					for (int j = 0; j < line2.length; j++) {
						switch(line2[j]){
							case "d": sb.append("b"); break;
							case "b": sb.append("d"); break;
							case "q": sb.append("p"); break;
							case "p": sb.append("q"); break;
						}
					}
					break;
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}


}
