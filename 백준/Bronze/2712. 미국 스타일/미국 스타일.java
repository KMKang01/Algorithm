import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final double oneKG2POUND = 2.2046;
	static final double onePOUND2KG = 0.4536;
	static final double oneLITER2GALLON = 0.2642;
	static final double oneGALLON2LITER = 3.7854;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String [] input = br.readLine().split(" ");
			double num = Double.parseDouble(input[0]);
			switch(input[1]){
				case "kg":
					num *= oneKG2POUND;
					sb.append(String.format("%.4f", num)).append(" lb\n");
					break;
				case "lb":
					num *= onePOUND2KG;
					sb.append(String.format("%.4f", num)).append(" kg\n");
					break;
				case "l":
					num *= oneLITER2GALLON;
					sb.append(String.format("%.4f", num)).append(" g\n");
					break;
				case "g":
					num *= oneGALLON2LITER;
					sb.append(String.format("%.4f", num)).append(" l\n");
					break;
			}
		}
		System.out.println(sb.toString().trim());
	}


}