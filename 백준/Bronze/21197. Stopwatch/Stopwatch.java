import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		if(T%2==1){
			System.out.println("still running");
		} else {
			int sum = 0;
			int prev = 0;
			for (int i = 0; i < T; i++) {
				int time = Integer.parseInt(br.readLine());
				if (i%2==0) {
					prev = time;
				} else {
					sum += time - prev;
					prev = 0;
				}
			}
			System.out.println(sum);
		}
	}
}