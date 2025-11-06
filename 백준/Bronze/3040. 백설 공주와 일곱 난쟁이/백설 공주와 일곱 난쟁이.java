import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int [] dwarfs = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int height =Integer.parseInt(br.readLine());
			dwarfs[i] = height;
			sum += height;
		}
		
		int index1 = 0;
		int index2 = 1;

		while(sum - dwarfs[index1] - dwarfs[index2] != 100) {
			index2++;
			if (index2 == 9) {
				index1++;
				index2 = index1 + 1;
			}
		}

		for (int i = 0; i < 9; i++) {
			if(i != index1 && i != index2) {
				sb.append(dwarfs[i]).append('\n');
			}
		}

		System.out.print(sb);
	}
}