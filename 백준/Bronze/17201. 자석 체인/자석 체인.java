import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] polesArr = br.readLine().split("");

		String prev = polesArr[0];
		boolean isConnected = true;

		for(int i = 1; i < polesArr.length; i++){
			if(prev.equals(polesArr[i])){
				isConnected = false;
				break;
			} else {
				prev = polesArr[i];
			}
		}

		System.out.println(isConnected ? "Yes" : "No");

	}
}


