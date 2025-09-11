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

		String[] line = br.readLine().split(" ");

		try{
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			System.out.println(a-b);
		} catch(NumberFormatException e){
			System.out.println("NaN");
		}
	}
}