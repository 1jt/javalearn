// 狮子
public class Demo31 {
    // 属性（静态特征）
    String color = "黄色";

    // 方法（动态特征）
    public void run(){
        System.out.println(color + "的狮子在跑");

    }

    public void cry(){
        System.out.println(color + "的狮子在咆哮");
    }

    public String robBall(){
        return "球";
    }

    public String getColor() { // 右键 -> generate -> Getter
        return color;
    }

    public String show(){
        //System.out.println("这是一个" + color + "的玩具狮子");
        return "这是一个" + getColor() + "的玩具狮子";
    }
}
