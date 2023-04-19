import java.util.Scanner;// 引入该类声明，alt+Enter自动补全代码

public class Demo04 {
    public static void main(String[] args) {
        //键盘输入功能 Scanner
        Scanner scanner = new Scanner(System.in);// 固定写法
        System.out.println("请输入您的姓名：");// 先提示
        String name = scanner.next();// 卡住，等待你的输入
        System.out.println("您的姓名是：" + name);
        // 后期服务器编程用不到，不需要太关注


        // 用法
        System.out.println("请输入整数：");
        int age = scanner.nextInt();
        System.out.println("请输入小数：");
        double money = scanner.nextDouble();
        System.out.println("整数：" + age + "\n小数：" + money);
    }
}
