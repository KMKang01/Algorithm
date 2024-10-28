import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(Integer.parseInt(br.readLine()));
		arr.add(Integer.parseInt(br.readLine()));
		arr.add(Integer.parseInt(br.readLine()));

		Collections.sort(arr);
		System.out.println(arr.get(1));

	}
}
