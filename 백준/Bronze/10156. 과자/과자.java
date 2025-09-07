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
		int K = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
		int M = Integer.parseInt(line[2]);

		System.out.println(K * N - M >= 0 ? K * N - M : 0);




	}


}
