import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean [] gonggang = new boolean[5];
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			gonggang[num - 1] = true;
		}

		boolean noGonggang = true;
		for(boolean g : gonggang) {
			if(!g) {
				noGonggang = false;
				break;
			}
		}
		System.out.println(noGonggang ? "NO" : "YES");

	}
}