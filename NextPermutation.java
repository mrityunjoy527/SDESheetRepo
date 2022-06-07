package sdeSheetQues;

import java.util.*;

public class NextPermutation {
    static ArrayList<Integer> nextPermutation(ArrayList<Integer> a) {
        int n = a.size();
        if(n == 1) return a;
        int i = n - 2;
        while(i >= 0 && a.get(i) >= a.get(i+1)) i--;
        if(i >= 0) {
            int j = n-1;
            while(a.get(j) <= a.get(i)) j--;
            swap(a, i, j);
        }
        reverse(a, i+1, n-1);
        return a;
    }
    static void swap(ArrayList<Integer> ar, int a, int b) {
        int t = ar.get(a);
        ar.set(a, ar.get(b));
        ar.set(b, t);
    }
    static void reverse(ArrayList<Integer> a, int i, int j) {
        while(i <= j) swap(a, i++, j--);
    }
}
