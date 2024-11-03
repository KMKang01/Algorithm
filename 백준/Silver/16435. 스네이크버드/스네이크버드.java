import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int L = Integer.parseInt(input[1]);
		String [] heights = br.readLine().split(" ");
		ArrayList<Integer> heightList = new ArrayList<>();
		for(String a: heights){
			heightList.add(Integer.parseInt(a));
		}
		Collections.sort(heightList);
		for(int a: heightList){
			if(L >= a) L++;
		}

		System.out.println(L);
	}
}