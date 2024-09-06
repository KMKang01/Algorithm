import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int result = 0;
        int [] nums = new int[input.length];
        for (int i = 0; i < input.length ; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        result = nums[0] * nums[1] - nums[2] * nums[3] * nums[4];
        System.out.println(result);
    }
}