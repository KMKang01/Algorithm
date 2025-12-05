import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		switch(line.charAt(0)){
			case 'F':
				System.out.println("Foundation");
				break;
			case 'C':
				System.out.println("Claves");
				break;
			case 'V':
				System.out.println("Veritas");
				break;
			case 'E':
				System.out.println("Exploration");
				break;
		}
	}
}