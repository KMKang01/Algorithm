import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String day = br.readLine();
		String [] line = br.readLine().split(" ");
		int count = 0;
		for(String s : line){
			if(s.equals(day)) count++;
		}
		System.out.println(count);


	}


}
