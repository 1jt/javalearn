import java.util.Arrays;

public class Demo19 {
    public static void main(String[] args) {
        // 升序和逆序输出
        char[] arr = {'a','c','u','b','e','z','p','f'};
        System.out.println("原字符序列：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(arr);
        System.out.println("升序排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("逆序排序后：");// arr.forr
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
