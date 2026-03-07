import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 갑옷을 만드는 재료들은 각각 '고유한 번호'를 가지고 있음
		// 갑옷은 두 개의 재료의 번호의 합으로 M이 되면 만들어짐
		// 최대 몇 개의 갑옷을 만들 수 있는가?
		int N = Integer.parseInt(br.readLine()); // 재료 개수
		int M = Integer.parseInt(br.readLine()); // 갑옷 수치 합
		String [] line = br.readLine().split(" ");
		ArrayList<Integer> materials = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			materials.add(Integer.parseInt(line[i]));
		}
		// 재료 배열 정렬
		Collections.sort(materials);
		// 투 포인터
		int left = 0;
		int right = N - 1;
		// 결과값
		int count = 0;
		while (left < right) {
			int sum = materials.get(left) + materials.get(right);
			if (sum == M) {
				count++;
				left++;
				right--;
			} else if (sum < M) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println(count);
	}
}