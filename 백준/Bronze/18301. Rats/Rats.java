import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int n1 = Integer.parseInt(line[0]);
		int n2 = Integer.parseInt(line[1]);
		int n12 = Integer.parseInt(line[2]);

		System.out.println((n1+1)*(n2+1)/(n12+1)- 1);

	}
}