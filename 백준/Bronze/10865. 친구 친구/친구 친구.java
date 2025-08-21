import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);

		int [] arr = new int[N];
		for (int i = 0; i < M; i++) {
			String [] line = br.readLine().split(" ");
			int A = Integer.parseInt(line[0]) - 1;
			int B = Integer.parseInt(line[1]) - 1;
			arr[A]++;
			arr[B]++;
		}
		for(int a: arr) System.out.println(a);


	}
}
