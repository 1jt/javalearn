import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入是否是会员（y/n）：");
        String yesno = scanner.next();//next只能接受字符串
        // ==用于基本数据类型的比较
        // equals()方法
        if (yesno.equals("y")){
            System.out.println("是会员");
        }else {
            System.out.println("不是会员");
        }
    }
}
