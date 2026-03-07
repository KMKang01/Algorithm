import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String line = br.readLine();
			sb.append(line);
			int vowels = 0;
			int consonants = 0;
			for(String s: line.split("")){
				if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")){
					vowels++;
				} else {
					consonants++;
				}
			}
			if(vowels > consonants){
				sb.append("\n1\n");
			} else {
				sb.append("\n0\n");
			}
		}
		System.out.print(sb);
	}
}