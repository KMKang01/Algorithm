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
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);

		int[]target=new int [10];
		int pw=9;
		while (A != 0){
			// 2의 9제곱부터 1까지 나눔
			if(A>=(int)Math.pow(2,pw)){
				A-= (int) Math.pow(2,pw);
				target[pw]++;
			} else{
				pw--;
			}
		}
		pw=9;
		while (B != 0){
			// 2의 9제곱부터 1까지 나눔
			if(B>=(int)Math.pow(2,pw)){
				B-= (int) Math.pow(2,pw);
				target[pw]++;
			} else{
				pw--;
			}
		}
		int C=0;
		for(int i=0;i<target.length;i++){
			if(target[i]==1){
				C+= (int) Math.pow(2,i);
			}
		}
		System.out.println(C);
	}
}