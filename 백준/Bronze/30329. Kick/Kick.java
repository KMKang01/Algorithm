import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		int count = 0;
		for (int i = 0; i < line.length() - 3; i++) {
			if(line.charAt(i) == 'k'
					&& line.charAt(i+1) =='i'
					&& line.charAt(i+2) =='c'
					&& line.charAt(i+3) =='k') {
				count++;
			}
		}
		System.out.println(count);
	}
}