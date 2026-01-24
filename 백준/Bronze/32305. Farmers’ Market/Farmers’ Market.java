import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 32305번
		String [] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);

		int dollars = Integer.parseInt(br.readLine());

		int sumOfApples = a * b;
		int dozens = (int) Math.ceil((double) sumOfApples / 12) ;

		System.out.println(dollars * dozens);
	}
}
