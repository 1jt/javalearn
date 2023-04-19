import java.io.File;

public class Demo25 {
    public static void main(String[] args) {
        showFiles(new File("C:\\Users\\刘佳涛涛\\Desktop\\现代密码学读书"));
    }

    public static void showFiles(File file){
        File[] files = file.listFiles();
        for (File f : files
             ) {
            if (f.isFile()) System.out.println(f.getName());
            if (f.isDirectory()) showFiles(f);
        }
    }
}
