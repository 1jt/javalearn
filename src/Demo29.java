public class Demo29 {
    public static void main(String[] args) {
        Demo27 x1 = new Demo27();
        Demo27 x2 = new Demo27();
        System.out.printf("%s\n", x1.hashCode()); // 内存地址
        System.out.printf("%s\n", x2.hashCode());
        // show()方法内部有一个变量this，接受住x1或x2的值
        x1.show();
        x2.show();

    }
}
