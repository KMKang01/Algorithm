import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			if( Math.abs(sum + n - 100) <= Math.abs(sum - 100)) sum += n;
            else break;
		}

		System.out.println(sum);
	}
}

