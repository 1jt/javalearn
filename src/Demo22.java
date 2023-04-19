import java.util.Arrays;

public class Demo22 {
    /*
    原则:
        方法：不调用不执行
        参数：必须给定
     */
    public static void main(String[] args) {
        f01();  // 没有返回值的函数，不能接收
        f02();  // 有返回值的函数，可以接收也可以不接收
        int i = f02();
        System.out.println(i);
        f03(18, "张三");
        f04(1);
        f04(1.0);
        f05(1);
        f05(1, 2);
        f05(1, 2, 3);
        f06();
        f06(1);
        f06(1, 2);
        f06(1, 2, 3);
        f06(new int[]{1, 3, 5, 7, 9});

    }
    /*
    共有的访问修饰符public 静态的static 没有返回值的void 方法名(参数列表){
        方法体;
    }
     */

    public  static void f01(){
        System.out.println("f01() 被调用了");
        return;// 可以省略
    }

    /*
    共有的访问修饰符public 静态的static 返回值int 方法名(参数列表){
        方法体;
        return 数字;
    }
     */
    public  static int f02(){
        System.out.println("f02() 被调用了");
        return 100;// 可以省略
    }

    /*
    共有的访问修饰符public 静态的static 没有返回值的void 方法名(参数列表){
        方法体;
    }
     */

    public  static void f03(int age, String name){
        System.out.println("f03() 被调用了，年龄" + age + ",名字" + name);
        return;// 可以省略
    }

    /*
    函数名可以相同，这种叫做函数重载
    函数重载原则：
        方法名想相同
        参数列表不相同
    注意：
        与返回值无关
     */
    public  static void f04(double money){
        System.out.println("f04(double money) 被调用了，财富" + money);
        return;// 可以省略
    }
    public  static void f04(int age){
        System.out.println("f04((int age) 被调用了，年龄" + age);
        return;// 可以省略
    }

    /*
    函数可变参数
     */
    public  static void f05(int x1){
        System.out.println("f05(int) 被调用了，x1" + x1);
    }
    public  static void f05(int x1, int x2){
        System.out.println("f05(int,int) 被调用了，x1=" + x1 + "，x2=" + x2);
    }
    public  static void f05(int x1, int x2, int x3){
        System.out.println("f05(int,int) 被调用了，x1=" + x1 + "，x2=" + x2 + "，x3=" + x3);
    }

    public  static void f06(int... x){ // 总而言之，不管如何传参数，x最终是int[]一维数组
        System.out.println("f06(int...)");
        System.out.println(Arrays.toString(x));
        // x.fori 正序
        // x.forr 倒序

        // 自动循环数组，也知道何时结束，每次取出一个送到变量a(所以是局部变量)上
        for (int a : x) { // x.for foreach输出
            System.out.println(a);
        }
    }



}
