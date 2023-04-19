public class Demo28 {
    public static void main(String[] args) {
        // 将Demo27类，理解成一种引用数据类型。只不过是自定义的引用数据类型
        // 1. 声明
        Demo27 demo27;
        // demo27.show();
        // 2. 分配空间
        demo27 = new Demo27();
        demo27.show();
        /*
        Demo27 x = null;
        System.out.println(x.name);
        空指针会报错：NullPointerException
         */
        // 3. 点访问属性
        demo27.name = "西安电子科技大学";
        demo27.jsNumber = 500;
        demo27.jfNumber = 50;
        // 4. 点访问方法
        demo27.show();
    }
}
