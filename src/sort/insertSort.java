package sort;

public class insertSort {
    public static void main(String[] args) {
        int[] a = {999, 85, 63, 20, 1, 75, 84, 62, 51, 45};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int current;
        for(int i=0;i<a.length-1;i++){
            current=a[i+1];
            int preindex=i;
            while(preindex>=0&&current<a[preindex]){
                a[preindex+1]=a[preindex];
                preindex--;
            }
            a[preindex+1]=current;
        }
        System.out.println("插入排序结果如下");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
