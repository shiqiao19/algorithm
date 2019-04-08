package sort;

import java.util.Arrays;

public class mergeSort {
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }
    public static void main(String[] args){
        int[] a = {999, 85, 63, 20, 1, 75, 84, 62, 51, 45};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int []b=MergeSort(a);
        System.out.println("归并排序结果如下");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }


    }

}
