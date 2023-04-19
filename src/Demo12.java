import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        // 使用switch的条件：等值判断
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名次：");
        int mingci = scanner.nextInt();
        /*
        变量整体重命名：全选变量，右键 -> Refactor -> rename
         */
        switch (mingci){
            case 1:
                System.out.println("夏令营");
                break;
            case 2:
                System.out.println("笔记本");
                break;
            case 3:
                System.out.println("移动硬盘");
                break;
            case 4:
                System.out.println("无");
                break;
        }

        /*
         可使用的数据类型：
         1. byte short int char
         2. String JDK7开始支持
         3. long float double不行
         4. enum 枚举（未来再说）
         */
        /*
        没有break导致一直往下运行的现象叫做switch透传
         */
    }
}
