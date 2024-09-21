import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		BigInteger bi = new BigInteger("1");
		for (int i = N; i > 0; i--) {
			bi = bi.multiply(BigInteger.valueOf(i));
		}
		StringBuilder sb = new StringBuilder(bi.toString());
		sb.reverse();
		String [] str = sb.toString().split("");
		int count = 0;
		for(String s: str){
			if(!s.equals("0")) break;
			else count++;
		}
		System.out.println(count);
	}
}