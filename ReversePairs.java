package sdeSheetQues;

import java.util.*;

public class ReversePairs {
    static int reversePairs(ArrayList<Integer> a) {
        return mergeSort(a, 0, a.size()-1);
    }
    static int mergeSort(ArrayList<Integer> a, int l, int r) {
        if(l >= r) return 0;
        int m = (l + r)/2;
        int revcnt = mergeSort(a, l, m);
        revcnt += mergeSort(a, m+1, r);
        revcnt += merge(a, l, m, r);
        return revcnt;
    }
    static int merge(ArrayList<Integer> a, int l, int m, int r) {
        int revcnt = 0;
        int j = m+1;
        for(int i=l; i<=m; i++) {
            while(j <= r && a.get(i) > 2l*a.get(j)) j++;
            revcnt += j - (m + 1);
        }
        int[] t = new int[r-l+1];
        int i = l;
        j = m+1;
        int k = 0;
        while(i <= m && j <= r) {
            if(a.get(i) < a.get(j)) {
                t[k++] = a.get(i++);
            }else {
                t[k++] = a.get(j++);
            }
        }
        while(i <= m) {
            t[k++] = a.get(i++);
        }
        while(j <= r) {
            t[k++] = a.get(j++);
        }
        for(i=0, j=l; i<r-l+1; i++, j++) {
            a.set(j, t[i]);
        }
        return revcnt;
    }
}
