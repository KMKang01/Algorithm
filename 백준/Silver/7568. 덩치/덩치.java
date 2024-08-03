import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
    입력을 저장하는 데 최대 수행 : 50번
    전체를 비교 시 최대 수행 : 2500번


*/


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Person[] persons = new Person[N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            int weight = Integer.parseInt(line.split(" ")[0]);
            int height = Integer.parseInt(line.split(" ")[1]);
            persons[i] = new Person(weight, height);
        }

        int count = 1;

        for (int i = 0; i < N; i++) {
            Person p1 = persons[i];
            for (int j = 0; j < N; j++) {
                Person p2 = persons[j];
                if ( p1.weight < p2.weight && p1.height < p2.height ) count++;
            }
            sb.append(count).append(" ");
            count = 1;
        }
        System.out.println(sb.toString().trim());
    }
}

class Person {
    int weight;
    int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

}
