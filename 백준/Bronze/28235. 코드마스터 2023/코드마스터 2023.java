import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		switch (line) {
			case "SONGDO":
				System.out.println("HIGHSCHOOL");
				break;
			case "CODE":
				System.out.println("MASTER");
				break;
			case "2023":
				System.out.println("0611");
				break;
			case "ALGORITHM":
				System.out.println("CONTEST");
				break;
		}


	}
}