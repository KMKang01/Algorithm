import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String [] line = br.readLine().split(" ");
			students.add(new Student(line[0],
					Integer.parseInt(line[1]),
					Integer.parseInt(line[2]),
					Integer.parseInt(line[3]))
			);
		}
		students.sort(new Student("",0,0,0));

		for(Student s : students) {
			sb.append(s.name).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}

class Student implements Comparator<Student> {
	String name;
	int koreanScore;
	int englishScore;
	int mathScore;

	public Student(String name, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.koreanScore < s2.koreanScore) {
			return 1;
		} else if(s1.koreanScore > s2.koreanScore) {
			return -1;
		} else {
			if(s1.englishScore > s2.englishScore) {
				return 1;
			} else if(s1.englishScore < s2.englishScore) {
				return -1;
			} else {
				if(s1.mathScore < s2.mathScore) {
					return 1;
				} else if(s1.mathScore > s2.mathScore) {
					return -1;
				} else {
					return s1.name.compareTo(s2.name);
				}
			}
		}
	}
}