import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int i = Integer.parseInt(br.readLine());
		for (int j = 0; j < i ; j++) {
			String [] line = br.readLine().split(" ");
			long a = Long.parseLong(line[0]);
			String op = line[1];
			long b = Long.parseLong(line[2]);
			long result = Long.parseLong(line[4]);
			switch (op) {
				case "+":
					if(a+b==result) sb.append("correct\n");
					else sb.append("wrong answer\n");
					break;
				case "-":
					if(a-b==result) sb.append("correct\n");
					else sb.append("wrong answer\n");
					break;
				case "*":
					if(a*b==result) sb.append("correct\n");
					else sb.append("wrong answer\n");
					break;
				case "/":
					if(b != 0 && a/b==result) sb.append("correct\n");
					else sb.append("wrong answer\n");
					break;
			}
		}

		System.out.println(sb.toString().trim());
	}
}


