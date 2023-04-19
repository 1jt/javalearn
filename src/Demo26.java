import java.io.File;

public class Demo26 {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int count){
        if (count == 1) return 1; //结束条件
        return sum(count-1) + count;
    }
}
