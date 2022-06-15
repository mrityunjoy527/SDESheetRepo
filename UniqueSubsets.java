package sdeSheetQues;

import java.util.*;

public class UniqueSubsets {
    static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int num[]) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        subsets2(0, num, l, ans);
        return ans;
    }
    static void subsets2(int index, int[] a, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans) {
        ans.add(new ArrayList<>(ds));
        for(int i = index; i < a.length; i++) {
            if(i > index && a[i - 1] == a[i]) continue;
            ds.add(a[i]);
            subsets2(i + 1, a, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
