import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 처음 발사된 폭죽이 적당한 높이에 도달하면 K개의 중형 불꽃으로 갈라짐
		// K개는 다시 K개의 소형 불꽃으로 갈라짐
		// N개 = 1 + K + K^2

		int i = 0;
		while((1 + i + i*i) != N) i++;

		System.out.println(i);

	}
}


