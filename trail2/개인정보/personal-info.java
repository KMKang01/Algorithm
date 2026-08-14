import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 0; i< 5; i++) {
            String [] line = br.readLine().split(" ");
            list.add(new Person(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2])));
        }

        ArrayList<Person> orderByNameList = new ArrayList<>(list);

        orderByNameList.sort(Comparator.comparing(Person::getName));
        System.out.println("name");
        for(Person p : orderByNameList) System.out.println(p.toString());

        System.out.println();

        ArrayList<Person> orderByHeightList = new ArrayList<>(list);
        orderByHeightList.sort(Comparator.comparingInt(Person::getHeight).reversed());
        System.out.println("height");
        for(Person p : orderByHeightList) System.out.println(p.toString());
        
    }
}

class Person {
    String name;
    int height;
    double weight;

    public String getName() {return name;}
    public int getHeight() {return height;}
    public double getWeight() {return weight;}

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return String.format("%s %d %.1f", name, height, weight);
    }
}