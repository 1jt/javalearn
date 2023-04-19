import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = scanner.nextInt();
         if (score >= 90){
             System.out.println("优秀");
         }else {
             System.out.println("其它");
         }
         // 只有一行时花括号可以省略
    }
}
