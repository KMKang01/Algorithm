import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] arr = line.split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], count);
                count++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (String s : arr) {
            result.add(map.get(Integer.parseInt(s)));
        }
        for (int a : result) sb.append(a).append(" ");

        System.out.println(sb.toString().trim());
    }
}