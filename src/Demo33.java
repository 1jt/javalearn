/** 局部变量 成员变量 */

// 局部变量 成员变量

public class Demo33 {
    /** 成员变量*/
    double r; // 成员变量 （可以放在后面）

    /**
     * 显示周长
     */
    public void showPerimeter(){
        System.out.println("周长：" + 2*3.14*r);
    }

    /**
     * 显示面积
     */
    public void showMJ(){
        System.out.println("周长：" + 3.14*r*r);
    }

    public void test(){
        int m = 0; // 局部变量（可以和成员变量同名）
        for (int i = 0; i < 5; i++) {
            m += i;
        }
        System.out.println("m:" + m);
        int r = 114514;
        System.out.println("r:" + r); // 局部变量优先级高
        System.out.println(this.r);
    }
    // double r; // 成员变量 （可以放在后面）
    /**
     * 可以使用javadoc -encoding utf-8 Demo33.java来生成关于该类的帮助文档
     *
     * 也可以Tools -> Generate JavaDoc
     * 但是注意得jdk17以上才支持，而且文件路径不能有中文（刘佳涛涛惨败）
     */
}
