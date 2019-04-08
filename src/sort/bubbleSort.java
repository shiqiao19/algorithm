package sort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {999, 85, 63, 20, 1, 75, 84, 62, 51, 45};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("冒泡结果如下");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
