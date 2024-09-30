import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[7];
		for (int i = 0; i < 7; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		ArrayList<Integer> list = new ArrayList<>();

		int sum = 0;

		for (int a : arr) {
			if (a % 2 != 0) {
				list.add(a);
			}
		}
		int min = 0;
		Collections.sort(list);
		if (!list.isEmpty()) {
			for(int a: list){
				sum += a;
			}
			min = list.get(0);
		} else {
			min = -1;
		}
if(sum !=0)
		System.out.printf("%d\n%d", sum, min);
else System.out.println(min);

	}
}