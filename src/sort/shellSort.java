package sort;

public class shellSort {
    public static void main(String[] args) {
        int[] a = {999, 85, 63, 20, 1, 75, 84, 62, 51, 45};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int len = a.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = a[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && a[preIndex] > temp) {
                    a[preIndex + gap] = a[preIndex];
                    preIndex -= gap;
                }
                a[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        System.out.println("希尔排序结果如下");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
