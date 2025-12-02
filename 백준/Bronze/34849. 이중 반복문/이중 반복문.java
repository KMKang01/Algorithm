import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int A  = Integer.parseInt(br.readLine());
		if( A <= 10000) System.out.println("Accepted");
		else System.out.println("Time limit exceeded");

	}
}