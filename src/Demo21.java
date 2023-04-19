public class Demo21 {
    public static void main(String[] args) {
        // 一维数组 int[] arr = new int[9]
        // 二维数组 int[][] arr = new int[3][9]
        int[][] arr = {
                {10, 8, 4, 5, 2, -1, 56, 33, 1},
                {110, 128, 54, 521, 232, -1, -56, 323, 541},
                {-210, 458, 1234, -785, 456312, -13521, 515346, 12333, 35411}
        };
        System.out.println(arr.length);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t" );
            }
            System.out.println();
        }
    }
}
