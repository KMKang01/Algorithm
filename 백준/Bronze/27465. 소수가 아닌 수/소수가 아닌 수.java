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
		while(N %2 != 0){
			N++;
		}
		if(N > 1000000000){
			N--;
		} else if (N == 2 ){N=4;}
		System.out.println(N);
	}
}