import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String [] commands = br.readLine().split("");
		int box3Count = 0;
		int ballLocation = 1; // 1, 2, 3
		for (int i = 0; i < N; i++) {
			if(commands[i].equals("L")){
				ballLocation = ballLocation == 1 ? 1: ballLocation - 1;
			} else {
				ballLocation = ballLocation == 3 ? 3: ballLocation + 1;
			}
		  	if(ballLocation == 3) box3Count++;
		}
		System.out.println(box3Count);
	}
}