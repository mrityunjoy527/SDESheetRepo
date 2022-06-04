package sdeSheetQues;

public class Sort012 {
    static void sort012(int[] arr) {
        int l = 0;
        int m = 0;
        int h = arr.length-1;
        while(m <= h) {
            if(arr[m] == 0) swap(arr, m++, l++);
            else if(arr[m] == 1) m++;
            else swap(arr, m, h--);
        }
    }
    static void swap(int[] ar, int a, int b) {
        int t = ar[a];
        ar[a] = ar[b];
        ar[b] = t;
    }
}
