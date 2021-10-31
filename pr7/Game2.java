import java.util.ArrayDeque;
import java.util.Scanner;

public class Game2 {

    ArrayDeque<Integer> deque1 = new ArrayDeque<>();
    ArrayDeque<Integer> deque2 = new ArrayDeque<>();
    int count = 0;

    public void run() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            deque1.addLast(in.nextInt());
        }
        for (int i = 0; i < 5; ++i) {
            deque2.addLast(in.nextInt());
        }
        while (!deque1.isEmpty() && !deque2.isEmpty()) {
            int x1 = deque1.pop();
            int x2 = deque2.pop();
            count++;
            if (count == 106) {
                System.out.println("botva");
                return;
            }
            if ((x1 > x2 && x1 != 9 && x2 != 0) || (x1 == 0 && x2 == 9)) {
                deque1.addLast(x1);
                deque1.addLast(x2);
            } else if ((x2 > x1 && x1 != 0 && x2 != 9) || (x1 == 9 && x2 == 0)) {
                deque2.addLast(x1);
                deque2.addLast(x2);
            }
        }
        if (deque1.isEmpty()) {
            System.out.println("second " + count);
        } else if (deque2.isEmpty()) {
            System.out.println("first " + count);
        }
    }
}
