import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		String [] votes = br.readLine().split("");
		int aCount = 0;
		int bCount = 0;
		
		for(String a: votes){
			if(a.equals("A")){aCount++;} else bCount++;
		}
		
		if(aCount == bCount){
			System.out.println("Tie");
		} else if(aCount > bCount){
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
	}
}
