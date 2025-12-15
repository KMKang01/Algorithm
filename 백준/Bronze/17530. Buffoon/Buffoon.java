import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		boolean heWon = true;
		int hisScore = 0;
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(i == 0) hisScore = num;
			else {
				if(hisScore < num) {
					heWon = false;
					break;
				}
			}
		}
		System.out.println(heWon? "S" : "N");
	}
}