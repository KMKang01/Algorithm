import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] ln = br.readLine().split("");

		int [] arr = new int[26];

		for(String s: ln) {
			arr[(int)s.charAt(0)-97]++;
		}

		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
}

