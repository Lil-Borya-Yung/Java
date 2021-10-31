import java.util.Scanner;

public class N11 {
    public static int recursion(int c, int cnt) {
        Scanner in = new Scanner(System.in);
        if (c != 2) {
            int num = in.nextInt();
            if (num == 0) num = in.nextInt();
            if (num == 0) c = 2;
            if (num == 1) cnt++;
            return recursion(c,cnt);
        }
        else return cnt;
    }
    public static void main(String[] args) {
        int c = 0, cnt = 0;
        System.out.println(recursion(c, cnt));
    }
}
