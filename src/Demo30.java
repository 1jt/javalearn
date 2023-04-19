public class Demo30 {
    public static void main(String[] args) {
        {
            int age = 22;
            System.out.println(age);
            // 栈会自动诞生、自动回收
        }
        {
            int age = 18;
            System.out.println(age);
        }
        {
            Demo27 school = new Demo27(); // new一律分配在堆
            // GC（垃圾管理机制），记录这块堆空间，引用数1（大于0就不能回收）
            school.name = "临县一中";
            school.show();
        }
        // school被回收了，垃圾回收机制感应到栈变量school被回收了，引用数0
        // GC的垃圾回收机制，就会考虑回收
        System.gc(); // 主动调用GC垃圾回收
        // Object 生命类型（啥类型都可以传）
        System.out.printf("八进制：%o 十进制：%d 十六进制：%x", 20, 20, 20 ); // Ctrl+P(parameter) 找到方法中所有的参数
    }
}
