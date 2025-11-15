import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		BigDecimal a = new BigDecimal(line[0]);
		BigDecimal b = new BigDecimal(line[1]);

		BigDecimal res = a.divide(b, 1001, BigDecimal.ROUND_DOWN);

		System.out.println(res);
	}
}