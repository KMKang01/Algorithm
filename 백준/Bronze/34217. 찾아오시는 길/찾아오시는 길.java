import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] line1 = br.readLine().split(" ");
		String [] line2 = br.readLine().split(" ");
		int a = Integer.parseInt(line1[0]);
		int b = Integer.parseInt(line1[1]);
		int c = Integer.parseInt(line2[0]);
		int d = Integer.parseInt(line2[1]);

		System.out.println(a+c > b+d ? "Yongdap" : (a+c < b+d ? "Hanyang Univ.":"Either"));
	}
}
