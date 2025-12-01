import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int A  = Integer.parseInt(br.readLine());
		int B  = Integer.parseInt(br.readLine());
		int C  = Integer.parseInt(br.readLine());
		if(A+B+C <= 21) System.out.println(1);
		else System.out.println(0);
	}
}