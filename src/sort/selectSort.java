package sort;

public class selectSort {
    public static void main(String []args){
        int[] a = {999, 85, 63, 20, 1, 75, 84, 62, 51, 45};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.println("选择排序结果如下");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }

}
