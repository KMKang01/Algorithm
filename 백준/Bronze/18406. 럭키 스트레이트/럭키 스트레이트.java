import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split("");

		int a = 0;
		int b =0;
		for (int i = 0; i < line.length ; i++) {
			if(i < line.length / 2){
				a += Integer.parseInt(line[i]);
			} else {
				b += Integer.parseInt(line[i]);
			}
		}
		if(a == b){
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}


	}
}