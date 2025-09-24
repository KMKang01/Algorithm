import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		int result = Integer.MIN_VALUE;
		String ops = "";
		while(!line.equals("=")){
			if(line.equals("+")){
				ops = "+";
			} else if(line.equals("-")){
				ops = "-";
			} else if(line.equals("*")){
				ops= "*";
			} else if(line.equals("/")){
				ops= "/";
			} else {
				if(ops.equals("")){
					result = Integer.parseInt(line);
				} else {
					int num = Integer.parseInt(line);
					switch(ops){
						case "+":
							result += num;
							break;
						case "-":
							result -= num;
							break;
						case "*":
							result *= num;
							break;
						case "/":
							result /= num;
							break;
					}
					ops = "";
				}
			}

			line = br.readLine();
		}
		System.out.println(result);
	}
}