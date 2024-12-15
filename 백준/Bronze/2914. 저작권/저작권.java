import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] line  = br.readLine().split(" ");

		int A = Integer.parseInt(line[0]);
		int I = Integer.parseInt(line[1]);

		// x / A 의 올림 연산한 값 = I ((24 - 1) * 38) + 1

		System.out.println((I-1) * A + 1);



	}
}