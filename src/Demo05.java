public class Demo05 {
    public static void main(String[] args) {
        // 八种数据类型
        /*
        整数：
            1个字节 byte   -128 -> 127
            2个字节 short  -32748 -> 32767
            4个字节 int    -21亿 -> 21亿 大约
            4个字节 long
         */
        long i;
        i = 4163543154654151l;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        /*
        小数：
            4个字节 float
            8个字节 double
         */
        float f = 3.14f;
        System.out.println(Float.MAX_VALUE);// 3后面38个0
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);// 1后面308个0
        System.out.println(Double.MIN_VALUE);

        /*
        字符：
            2个字节 char 0~65535 唯一没有负数的概念
         */
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);

        /*
        布尔：
            1个字节 boolean 不是数值，而是一个真假（前七个位是0 0000 000-）
         */
        boolean bool1 = false;
        boolean bool2 = true;
        System.out.println(bool1);
        System.out.println(bool2);
    }
}
