package sdeSheetQues;

import java.util.*;

public class PairSum {
    static int[][] pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        ArrayList<int[]> l = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == s) {
                    l.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        int[][] ans = new int[l.size()][2];
        for(int i=0; i<l.size(); i++) {
            ans[i][0] = l.get(i)[0];
            ans[i][1] = l.get(i)[1];
        }
        return ans;
    }
}
