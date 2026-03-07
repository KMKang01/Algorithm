import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int x = Integer.parseInt(br.readLine());
		if(x>5) System.out.println("Success!");
		else System.out.println("Oh My God!");
	}
}