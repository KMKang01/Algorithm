import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		String [] arr = br.readLine().split(" ");
		int [] counts = new int [N];
		for (int i = 1; i <= N; i++) {
			boolean misketa = false;
			int idx = 0;
			for (int j = 0; j < arr.length; j++) {
				if(!misketa) {
					if(Integer.parseInt(arr[j]) == i) {
						misketa = true;
						idx = j;
					}
				} else {
					if(Integer.parseInt(arr[j]) == i) {
						counts[i-1] = (j - 1) - idx;
					}
				}
			}
		}
		int max = 0;
		for(int a: counts) {
			max = Math.max(max, a);
		}
		System.out.println(max);
	}
}