import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int x = Integer.parseInt(line[2]);
		int y = Integer.parseInt(line[3]);
		
		int direct = Math.abs(a - b);
		int viaXY = Math.abs(a - x) + Math.abs(b - y);
		int viaYX = Math.abs(a - y) + Math.abs(b - x);

		int answer = Math.min(direct, Math.min(viaXY, viaYX));

		System.out.println(answer);
	}
}