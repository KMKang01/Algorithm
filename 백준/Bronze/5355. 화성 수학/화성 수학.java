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

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			double num = Double.parseDouble(line[0]);
			for (int j = 1; j < line.length; j++) {
				switch (line[j]){
					case "@":
						num = atOperate(num);
						break;
					case "%":
						num = perOperate(num);
						break;
					case "#":
						num = sharpOperate(num);
						break;
				}
			}
			sb.append(String.format("%.2f", num)).append("\n");
		}
		System.out.println(sb.toString().trim());
	}

	static public double atOperate(Number num) {
		return (double) num * 3;
	}

	static public double perOperate(Number num) {
		return (double) num + 5;
	}

	static public double sharpOperate(Number num) {
		return (double) num - 7;
	}
}