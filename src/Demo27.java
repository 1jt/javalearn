//类名 可以有多个类但只能有一个public，且与文件名保持一致
public class Demo27 {
    // 属性
    String name;// 名称
    int jsNumber;// 教师数目
    int jfNumber;// 机房数目

    // 方法
    public void show(){
        System.out.println(this.hashCode());
        System.out.println("名称：" + name + "\n教师数量:" + jsNumber
                + "\n机房数量:" + jfNumber);
    }
}
