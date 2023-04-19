public class Demo13 {
    public static void main(String[] args) {
        /*
        while (条件) {
            循环的体（内容）;
            更新条件;
        }
         */
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        /*
        do {
            循环的体（内容）;
            更新条件;
        } while(条件);//注意分号

        实现就知道循环至少走一次则选择这个
         */
        i = 1;
        sum = 0;
        while (i <= 100){
            if (i % 2 == 0) sum += i;
            i++;
        }
        System.out.println(sum);
        /*
        管理断点
        Run -> View Breakpoints
        右键断点可以编辑断点
         */
    }
}
