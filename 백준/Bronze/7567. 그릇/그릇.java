import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] lines = br.readLine().split("");
		String prev = "";
		int height = 0;
		for (int i = 0; i < lines.length; i++) {
			String now = lines[i];
			if(prev.equals("")){
				prev = now;
				height += 10;
			} else {
				if(prev.equals(now)){
					height += 5;
				} else {
					prev= now;
					height += 10;
				}
			}
		}
		System.out.println(height);
	}



}