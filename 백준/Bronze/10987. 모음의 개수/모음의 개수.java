import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] str = br.readLine().split("");
		int cnt=0;
		for(String s : str){
			if(s.matches("[a|e|i|o|u]")){
				cnt++;
			}
		}
		System.out.println(cnt);



	}
}

