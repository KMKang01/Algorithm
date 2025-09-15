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

		long sum = 0;
		String [] N = br.readLine().split("");
		for (int i = 0; i <  N.length; i++) {
			int num = Integer.parseInt(N[i]);
			 sum += (long) num * num * num*num*num;
		}
		System.out.println(sum);


	}
}