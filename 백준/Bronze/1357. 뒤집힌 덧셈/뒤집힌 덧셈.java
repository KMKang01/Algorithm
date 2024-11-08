import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] input = br.readLine().split(" ");
		int X = Integer.parseInt(sb.append(input[0]).reverse().toString());
		sb = new StringBuilder();
		int Y = Integer.parseInt(sb.append(input[1]).reverse().toString());
		sb = new StringBuilder();

		int sum = X + Y;
		System.out.println(Integer.parseInt(sb.append(sum).reverse().toString()));


	}
}

