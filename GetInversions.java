package sdeSheetQues;

public class GetInversions {
    static long getInversions(long arr[], int n) {
        long temp[] = new long[n];
        return mergeSort(arr, temp, 0, n-1);
    }
    static long mergeSort(long[] a, long[] temp, int low, int high) {
        long inv_count = 0;
        if(low < high) {
            int mid = (low + high)/2;
            inv_count += mergeSort(a, temp, low, mid);
            inv_count += mergeSort(a, temp, mid+1, high);
            inv_count += merge(a, temp, low, mid+1, high);
        }
        return inv_count;
    }
    static long merge(long[] a, long[] temp, int low, int mid, int high) {
        int i = low, j = mid, k = low;
        long inv_cnt = 0;
        while(i <= mid-1 && j <= high) {
            if(a[i] <= a[j]) {
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
                inv_cnt += mid - i;
            }
        }
        while(i <= mid-1) temp[k++] = a[i++];
        while(j <= high) temp[k++] = a[j++];
        for(i = low; i<= high; i++) a[i] = temp[i];
        return inv_cnt;
    }
}
