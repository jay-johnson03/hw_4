import java.util.PriorityQueue;
import java.util.Scanner;

public class Question implements Comparable<Question> {
    public static void main(String[] args) {
        //PriorityQueue<Questions> heap = new PriorityQueue<>();
        BinaryHeap<Question> heap = new BinaryHeap<>();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                heap.add(new Question(i + 2, j + 2));
            }
        }
        while (true) {
            Question current = heap.extract();
            current.ask();
            heap.add(current);
        }
    }
    public String statement;
    public String answer;
    public long duration;
    public long missed;
    
    public Question(int a, int b) {
        statement = String.format("%d x %d = ?", a, b);
        answer = String.format("%d", a*b);
    }
    public void ask() {
        Scanner scanner = new Scanner(System.in);
        //long start = System.nanoTime();
        System.out.printf("%s ", statement);
        String given = scanner.next().trim();
        //duration += System.nanoTime() - start;
        //scanner.close();
        missed += given.equals(answer) ? -1 : 1;
        scanner.close();
    }

    public int compareTo(Question other) {
        return Long.compare(this.key(), other.key());
    }

    public String toString() {
        return String.format("%d: %s", this.key(), statement);
    }

    private long key() {
        return missed + duration / 1000000;
    }

}
