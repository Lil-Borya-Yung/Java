import java.util.ArrayList;
import java.util.Scanner;

public class Game3 {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    int count = 0;

    public void run() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            list1.add(in.nextInt());
        }
        for (int i = 0; i < 5; ++i) {
            list2.add(in.nextInt());
        }
        while (!list1.isEmpty() && !list2.isEmpty()) {
            int x1 = list1.remove(0);
            int x2 = list2.remove(0);
            count++;
            if (count == 106) {
                System.out.println("botva");
                return;
            }
            if ((x1 > x2 && x1 != 9 && x2 != 0) || (x1 == 0 && x2 == 9)) {
                list1.add(x1);
                list1.add(x2);
            } else if ((x2 > x1 && x1 != 0 && x2 != 9) || (x1 == 9 && x2 == 0)) {
                list2.add(x1);
                list2.add(x2);
            }
        }
        if (list1.isEmpty()) {
            System.out.println("second " + count);
        } else if (list2.isEmpty()) {
            System.out.println("first " + count);
        }
    }
}
