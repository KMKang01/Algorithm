import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		String d = (input[1]);

		String [] arr = new String [n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.toString(i+1);
		}


		int count = 0;

		for(String a : arr) {
			for(String c: a.split("")) if (c.equals(d)) count++;
		}

		System.out.println(count);
	}
}