import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String st1 = br.readLine();
		String st2 = br.readLine();
		System.out.println(st1.equals(st2)? 0 : 1550);
	}
}