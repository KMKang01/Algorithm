import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 0; i<n;i++) {
            String [] line = br.readLine().split(" ");
            list.add(new Person(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2])));
        }
        list.sort(Comparator.comparingInt(Person::getHeight));
        for(Person p : list) {
            System.out.println(p.toString());
        }
    }
}

class Person {
    String name; 
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {return name;}
    public int getHeight() {return height;}
    public int getWeight() {return weight;}

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}