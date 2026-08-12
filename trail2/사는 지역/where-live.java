import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();

        for(int i = 0; i < n ; i++) {
            String [] line = br.readLine().split(" ");
            list.add(new Person(line[0], line[1], line[2]));
        }
        list.sort(null);
        System.out.print(list.get(n -1).toString());
    }
}

class Person implements Comparable<Person> {
    String name;
    String postcode;
    String region;
    public Person(String name, String postcode, String region) {
        this.name = name;
        this.postcode = postcode;
        this.region = region;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return "name " + name + "\naddr " + postcode + "\ncity " + region;
    }
}