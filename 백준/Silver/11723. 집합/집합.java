import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        String[] sList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        List<String> fullList = new ArrayList<>(Arrays.asList(sList));

        List<String> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            switch (line.split(" ")[0]) {
                case "add":
                    if (!list.contains((line.split(" ")[1]))) {
                        list.add((line.split(" ")[1]));
                    }
                    break;
                case "remove":
                    list.remove((line.split(" ")[1]));
                    break;
                case "check":
                    if (list.contains((line.split(" ")[1]))) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle":
                    if (list.contains((line.split(" ")[1]))) {
                        list.remove((line.split(" ")[1]));
                    } else {
                        list.add((line.split(" ")[1]));
                    }
                    break;
                case "all":
                    list = new ArrayList<>(fullList);
                    break;
                case "empty":
                    list.clear();
                    break;
            }
        }
        System.out.println(sb.toString().trim());
    }
}