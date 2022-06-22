package sdeSheetQues;

import java.util.ArrayList;

public class PowerSet {
    static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<=(1 << arr.size())-1; i++) {
            ArrayList<Integer> l = new ArrayList<>();
            for(int j=0; j<arr.size(); j++) {
                if((1 & (i >> j)) != 0) {
                    l.add(arr.get(j));
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
