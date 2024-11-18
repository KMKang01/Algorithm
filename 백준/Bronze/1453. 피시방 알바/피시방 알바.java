import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] lines = br.readLine().split(" ");
		boolean[] seats = new boolean[100];
		int reject = 0;
		for (int i = 0; i < lines.length; i++) {
			if(seats[Integer.parseInt(lines[i])-1]) reject++;
			else seats[Integer.parseInt(lines[i])-1] = true;
		}
		System.out.println(reject);

	}
}