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

		String [] line1 = br.readLine().split(" ");
		String [] line2 = br.readLine().split(" ");

		int minguk = 0;
		int manse = 0;
		for(String s : line1) { minguk += Integer.parseInt(s); }
		for (String s : line2) { manse += Integer.parseInt(s); }
		System.out.println(Math.max(minguk, manse));
	}


}
