public class Demo16 {
    public static void main(String[] args) { // java Demo16 zx ls ww（这些值会赋给args）
        // 方法区↑
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        // 声明一个数组：指明里面只能存放整数
        int[] arr;// int arr[] 这样写也可以
        // 赋值
        arr = new int[5];
        // 给数组里面的5个成员，都分别给个成绩
        // 属于引用数据类型，本质是一个地址指向
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // 栈没有人工赋值，不能读
        // 堆不需要人工赋值，就能读
        // 自动对堆中所有的内存字节进行clear，每一个字节每一个位清零
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    }
}
