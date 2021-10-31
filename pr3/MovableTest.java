public class MovableTest {
    public static void main(String[] args) {
        MovableCircle mc1 = new MovableCircle(1, 2, 4, 2, 3);
        MovableRectangle mr1 = new MovableRectangle(4,7,1,3,2,2);
        System.out.println(mc1.toString());
        System.out.println(mr1.toString());

        System.out.println();

        mc1.moveDown();
        System.out.println("Move Down");
        System.out.println(mc1.toString());
        mc1.moveRight();
        System.out.println("Move Right");
        System.out.println(mc1.toString());
        mc1.moveUp();
        System.out.println("Move Up");
        System.out.println(mc1.toString());

        System.out.println();

        mr1.moveLeft();
        System.out.println("Move Left");
        System.out.println(mr1.toString());
        mr1.moveLeft();
        System.out.println("Move Left");
        System.out.println(mr1.toString());
        mr1.moveUp();
        System.out.println("Move Up");
        System.out.println(mr1.toString());

    }
}
