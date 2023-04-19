public class Demo06 {
    public static void main(String[] args) {
        char c1 = '中';
        int i = 1;
        // 强转语法：（目标类型）表达式
        char c2 = (char) (c1 + i);
        System.out.println(c2);
    }
}
