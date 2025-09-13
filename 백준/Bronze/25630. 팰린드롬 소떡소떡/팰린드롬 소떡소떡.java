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

		int N = Integer.parseInt(br.readLine());

		String [] line = br.readLine().split("");
		int count = 0;
		for (int i = 0; i < N / 2; i++) {
			count = line[i].equals(line[N - 1 - i]) ? count : count + 1;
		}
		System.out.println(count);
	}
}