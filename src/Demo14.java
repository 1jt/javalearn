import java.util.Scanner;// 全类名

public class Demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// 类名
        /*
        类名可以重复，但是全类名不可以重复
        java.lang.XXX 不需要专门导入
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum += i;
        }
        // 这儿的i是一个局部变量
        // System.out.println(i);
        System.out.println(sum);
    }
}
