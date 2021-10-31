import java.util.Scanner;
import java.util.Stack;

public class Game1 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();
    int count = 0;

    public void run() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            tempStack.push(in.nextInt());
        }
        while (!tempStack.isEmpty()) {
            stack1.push(tempStack.pop());
        }
        for (int i = 0; i < 5; ++i) {
            tempStack.push(in.nextInt());
        }
        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            int x1 = stack1.pop();
            int x2 = stack2.pop();
            count++;
            if (count == 106) {
                System.out.println("botva");
                return;
            }
            if ((x1 > x2 && x1 != 9 && x2 != 0) || (x1 == 0 && x2 == 9)) {
                while (!stack1.isEmpty()) {
                    tempStack.push(stack1.pop());
                }
                tempStack.push(x1);
                tempStack.push(x2);
                while (!tempStack.isEmpty()) {
                    stack1.push(tempStack.pop());
                }
            } else if ((x2 > x1 && x1 != 0 && x2 != 9) || (x1 == 9 && x2 == 0)) {
                while (!stack2.isEmpty()) {
                    tempStack.push(stack2.pop());
                }
                tempStack.push(x1);
                tempStack.push(x2);
                while (!tempStack.isEmpty()) {
                    stack2.push(tempStack.pop());
                }
            }
        }
        if (stack1.isEmpty()) {
            System.out.println("second " + count);
        } else if (stack2.isEmpty()) {
            System.out.println("first " + count);
        }
    }
}