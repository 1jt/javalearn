import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> 幸运抽奖\n");
        System.out.println("请输入4位会员号：");
        int id = scanner.nextInt();
        int baiwei = id /100 %10;
        /*
        Math.random()产生一个左闭右开[0.0-1.0)之间的一个小数
        目标产生0~9之间的数字，一共十个
        [0.0-1.0) * 10 -> [0.0-10.0) -> 强转[0-10)
         */
        int luck = (int) (Math.random()*10);
        if (baiwei == luck) System.out.println("奖励MP3一个。");
        else System.out.println("谢谢惠顾");
    }
}
