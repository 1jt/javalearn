import java.util.Arrays;

public class Demo18 {
    public static void main(String[] args) {
        int[] arr = new int[]{8,282,183,684,585};
        int[] arr2 = new int[]{8,282,183,684,585};
        // java.util.Arrays
        Arrays.sort(arr);// 升序排序
        System.out.println(arr);//[I@1b6d3586 [:数组 I：整数 @八位十六进制：地址
        System.out.println(Arrays.toString(arr));
        /*
        boolean equals(array1,array2)       比较array1,array2两个数组是否相等
        void fill(array,val)                把array所有的元素赋值为val
        copyOf(array,length)                把array复制成一个长度为length的新数组，返回类型与复制的数组一致，少截多补0
        （快捷键 copyOf(array,length).var）
        int binarySearch(array, val)        查询元素值val在array中的下标，要求数组已经按升序排列（因为是用二分法查询的）
         */
        Arrays.fill(arr, 11);
        System.out.println(Arrays.toString(arr));
        int[] arr3 = Arrays.copyOf(arr2, 7);
        System.out.println(Arrays.toString(arr3));
        int pos = Arrays.binarySearch(arr, 11);
        System.out.println("pos:" + pos);
        int pos2 = Arrays.binarySearch(arr2, 282);//没有找到，返回插入点的下标取负数-1
        System.out.println("pos2:" + pos2);
        Arrays.sort(arr2);
        pos2 = Arrays.binarySearch(arr2, 282);
        System.out.println("pos2:" + pos2);
    }
}
