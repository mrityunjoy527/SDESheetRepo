package sdeSheetQues;

public class SearchInRotatedSortedArray {
    static int search(int a[], int key) {
        int l = 0, r = a.length-1;
        while(l <= r) {
            int m = (l+r)/2;
            if(a[m] == key) return m;
            if(a[l] <= a[m]) {
                if(a[l] <= key && key <= a[m]) {
                    r = m - 1;
                }else {
                    l = m + 1;
                }
            }else {
                if(a[m] <= key && key <= a[r]) {
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
