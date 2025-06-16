import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
		int J = Integer.parseInt(input[0]);
		String item = input[1];
		int sum = 0;

		for (int i = 0; i <  J; i++) {
			String [] line = br.readLine().split(" ");
			String name = line[0];
			int amount = Integer.parseInt(line[1]);
			for(String s : name.split("_")) {
				if(s.equals(item)) {
					sum += amount;
					break;
				}
			}
		}

		System.out.println(sum);
	}
}


