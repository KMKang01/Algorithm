import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] S = br.readLine().split("");
		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getDecoder();

		String[] chs = {
				"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ",
				"ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ",
				"ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ",
				"ㅋ", "ㅌ", "ㅍ", "ㅎ"
		};

		StringBuilder sb = new StringBuilder();

		for(String a : S) {
			char c = a.charAt(0);
			if(c >= 0xAC00) {
				int uniVal = c - 0xAC00;
				int cho = ((uniVal - (uniVal % 28))/28)/21;
				sb.append(chs[cho]);
			}
		}
		System.out.println(sb);

	}
}


