import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);

		int col1 =( N - 1 )/ 4 ;
		int row1 = N % 4 == 0 ? 4 : N % 4;

		int col2 = (M -1 ) / 4;
		int row2 = M % 4 == 0 ? 4 : M % 4;

		int col_gap = Math.abs(col1 - col2);
		int row_gap = Math.abs(row1 - row2);
		int result = col_gap + row_gap;
		System.out.println(result);

	}
}