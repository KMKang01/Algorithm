import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line  = br.readLine().split(" ");
		BigDecimal N = new BigDecimal(line[0]);
		double M = Double.parseDouble(line[1]);

		if(N.multiply(new BigDecimal("0.81"), MathContext.DECIMAL32).doubleValue() <= M) System.out.println("yaho");
		else System.out.println("no");
	}
}