/**
 * 文档注释
 * 刘佳涛涛
 */

public class Demo01 {
    /*
    多行注释
    多行注释
    多行注释
    多行注释
     */
    public static void main(String[] args) {
        //单行注释
        System.out.println("hello world!");//Ctrl+D 复制整行
        System.out.print("hello world!\n");
        System.out.println("hello world!\\");
        System.out.println("hello world!\tabc");
        char c1 = 97;
        char c2 = 'a';
        System.out.println(c1);
        System.out.println(c2  );

        int age = 20;
        System.out.println("年龄:" + age);
        age = 22;
        System.out.println("年龄:" + age);//shift+alt+上下箭头，上移下移代码行
        System.out.println("git");//shift+alt+上下箭头，上移下移代码行
        System.out.println("宿舍");//shift+alt+上下箭头，上移下移代码行
        System.out.println(System.getProperty("java.version"));

    }
}
