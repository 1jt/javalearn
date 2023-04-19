public class Demo02 {
    public static void main(String[] args) {
        //常用数据类型
        int i = 10;//整数
        double d = 3.14;//小数
        char c = '中';//字符
        String s = "中国";//字符串
        System.out.println("整数：" + i + "\n小数：" + d + "\n字符：" + c + "\n字符串：" + s);
        // 使用顺序：
        // 1.声明
        // 2.赋值
        // 3.使用
        // javac编译命令：会事先检查变量是否已经赋值

        // 常量的命名法则，全部大写，如果有多个单词，用_隔离
        final int AGE = 18;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(AGE);
        final String CHINA = "中华人民共和国";
        System.out.println(CHINA);

        //变量命名规则
        /*
        首字母必须是：字符,$,_(汉字也可以但是不推荐)
        后续必须是：字符,$,_，0~9
        注意，不能是关键字
         */
        int ￥中国1=1;
        System.out.println(￥中国1);


        // 类名大驼峰命名法
        // 变量小驼峰命名法
        // 尽量使用有意义的单词，实在没有合适的用拼音也行
        int myAge = 18;
        // 循环因子：i j k
    }
}
