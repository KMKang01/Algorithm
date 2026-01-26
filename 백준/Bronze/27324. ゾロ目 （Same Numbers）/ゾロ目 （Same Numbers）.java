import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split("");
		if(line[0].equals(line[1])) System.out.println(1);
		else System.out.println(0);
	}
}