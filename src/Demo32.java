import java.util.Scanner;

public class Demo32 {
    public static void main(String[] args) {
        Demo31 lion = new Demo31();
        System.out.println(lion.show());
        lion.run();
        lion.cry();
        lion.robBall();

        Scanner scanner = new Scanner(System.in);
        Demo33 circle = new Demo33();
        System.out.println("请输入半径");
        circle.r = scanner.nextDouble();
        circle.showPerimeter();
        circle.showMJ();
        circle.test();
    }
}
