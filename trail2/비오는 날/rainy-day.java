import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Data> list = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            String [] line = br.readLine().split(" ");
            if(line[2].equals("Rain")) {
                int [] date = Arrays.stream(line[0].split("-")).mapToInt(Integer::parseInt).toArray();
                list.add(new Data(date[0], date[1], date[2], line[1], line[2]));
            }
        }
        list.sort(
            Comparator.comparingInt(Data::getYear)
            .thenComparingInt(Data::getMonth)
            .thenComparingInt(Data::getDay)
        );

        System.out.print(list.get(0).toString());
    }
}

class Data {
    int year;
    int month;
    int day;
    String dayOfWeek;
    String weather;

    public Data (int year, int month, int day, String dayOfWeek, String weather ){
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
    }

    public int getYear() { return this.year; }
    public int getMonth() {return this.month;}
    public int getDay() {return this.day;}
    public String getDayOfWeek() {return this.dayOfWeek;}
    public String getWeather() {return this.weather;}

    @Override
    public String toString() {
        return String.format("%4d-%02d-%02d %s %s", year, month, day, dayOfWeek, weather);
    }
}