import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        // 声明 分配空间 赋值
        int[] arr1 = new int[]{81,82,83,84,85};
        int[] arr2 = {81,82,83,84,85};// 如果声明 分配空间 赋值是在一行，省略new int[]
        // java的数组，天然有一个只读属性————length
        System.out.println(args.length);

//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);
//        System.out.println(arr1[3]);
//        System.out.println(arr1[4]);
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);
//        System.out.println(arr2[4]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数：");
        int number = scanner.nextInt();
        boolean bFound = false;

        for (int i = 0; i < arr1.length; i++) { //arr1.fori
            if (number == arr1[i]){
                bFound = true;
                break;
            }
        }
        System.out.println(bFound ? "找到" : "没有找到");// 唯一的三元操作符
    }
}
