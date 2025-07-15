import javax.print.Doc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String [] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int M = Integer.parseInt(line[1]);

			// N개 문서의 중요도 1~9
			String [] docs = br.readLine().split(" ");
			ArrayList<Document> queue = new ArrayList<>();
			for (int j = 0; j < N; j++) {
				queue.add(new Document(j, Integer.parseInt(docs[j])) );
			}
			int count = 1;
			while(true) {
				Document cur = queue.get(0);
				boolean isMax = true;
				for (int j = 1; j < queue.size(); j++) {
					if (cur.priority < queue.get(j).priority) {
						isMax = false;
						break;
					}
				}
				if(isMax) {
					if(cur.index == M) {
						System.out.println(count);
						break;
					} else {
						count++;
						queue.remove(0);
					}
				} else {
					queue.add(queue.remove(0));
				}
			}
		}
	}
}

class Document implements Comparator<Document> {
	int index;
	int priority;

	Document(int index, int priority) {
		this.index = index;
		this.priority = priority;
	}

	@Override
	public int compare(Document o1, Document o2) {
		return Integer.compare(o2.priority, o1.priority);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Document;
	}

	@Override
	public String toString() {
		return "Document{" +
				"index=" + index +
				", priority=" + priority +
				'}';
	}
}

