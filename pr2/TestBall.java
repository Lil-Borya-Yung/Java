import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10, 20);
        System.out.println(b1);
        b1.setY(3);
        System.out.println(b1);
        b1.move(5,2);
        System.out.println(b1);

    }
}
