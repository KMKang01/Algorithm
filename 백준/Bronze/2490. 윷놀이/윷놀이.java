import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		String[] line2 = br.readLine().split(" ");
		String[] line3 = br.readLine().split(" ");
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for (String s : line1) {
			count1 = s.equals("0") ? count1 : count1 + 1;
		}
		for (String s : line2) {
			count2 = s.equals("0") ? count2 : count2 + 1;
		}
		for (String s : line3) {
			count3 = s.equals("0") ? count3 : count3 + 1;
		}

		yutnori(count1);
		yutnori(count2);
		yutnori(count3);
	}

	public static void yutnori(int count3) {
		switch (count3) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
		}
	}
}