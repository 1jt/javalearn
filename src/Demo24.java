import java.util.Arrays;

public class Demo24 {
    /*
    传参，引用数据类型
     */
    public static void main(String[] args) {
        int[] y = {10, 20, 30};
        f01(y); // 地址值传递
        System.out.println(Arrays.toString(y));

    }

    public  static void f01(int[] x){
        System.out.println(Arrays.toString(x));
        x[1]++;
        System.out.println(Arrays.toString(x));
    }
}
