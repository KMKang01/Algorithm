import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int A = Integer.parseInt(line[1])-1;
		int B = Integer.parseInt(line[2])-1;

		int [][] matrix = new int[N][N];

		for (int i = 0; i < N; i++) {
			String [] row = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(row[j]);
			}
		}

		int jinseo = matrix[A][B];

		boolean flag = false;
		for (int a : matrix[A]) {
			if(a>jinseo) flag = true;
		}

		for (int i = 0; i < N; i++) {
			int a = matrix[i][B];
			if(a>jinseo) flag = true;
		}
		if(flag) System.out.println("ANGRY");
		else System.out.println("HAPPY");
	}
}