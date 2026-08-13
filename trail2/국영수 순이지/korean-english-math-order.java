import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            String [] line = br.readLine().split(" ");
            int [] scores = Arrays.stream(new String[]{line[1], line[2], line[3]}).mapToInt(Integer::parseInt).toArray();
            list.add(new Person(line[0], scores[0], scores[1], scores[2]));
        }

        list.sort(Comparator
            .comparingInt(Person::getKorean)
            .thenComparingInt(Person::getEnglish)
            .thenComparingInt(Person::getMath)
            .reversed()
        );

        for(Person p: list) {
            System.out.println(p.toString());
        }
    }
}

class Person {
    String name;
    int korean;
    int english;
    int math;

    public String getName() {return name;}
    public int getKorean() {return korean;}
    public int getEnglish() {return english;}
    public int getMath() {return math;}
    
    public Person(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString() {
        return name + " " + korean + " " + english + " " + math;
    }
}