import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0 ; i<n; i++) {
            String [] line = br.readLine().split(" ");
            list.add(new Student(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3])));
        }

        list.sort(Comparator.comparingInt(Student::getTotal));
        for(Student s : list) {System.out.println(s.toString());}

    }
}

class Student {
    String name;
    int s1;
    int s2;
    int s3;

    public String getName() {return name;}
    public int getS1() {return s1;}
    public int getS2() {return s2;}
    public int getS3() {return s3;}
    public int getTotal() {return s1+s2+s3;}

    public Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String toString() {
        return String.format("%s %d %d %d", name, s1, s2, s3);
    }
}