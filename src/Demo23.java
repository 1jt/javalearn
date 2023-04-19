public class Demo23 {
    /*
    传参，基本数据类型
     */
    public static void main(String[] args) {
        int ljt = 10;
        f01(ljt); // ljt实参,都是值传递,类似于 int x = ljt
        System.out.println(ljt);

        // 这儿再来一句int y = 10;就不行了
        {
            int y = 10;
        }
        {
            int y = 10;
        }

    }
    /*
        x:形参
     */
    public  static void f01(int x){
        System.out.println(x);
        x++;
        System.out.println(x);
    }
}
