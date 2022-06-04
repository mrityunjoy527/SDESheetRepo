package sdeSheetQues;

import java.util.ArrayList;

public class PascalTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        ArrayList<Long> l = new ArrayList<>();
        for(int i=0; i<n; i++) {
            l.add(0, 1l);
            for(int j=1; j<l.size()-1; j++) {
                l.set(j, l.get(j)+l.get(j+1));
            }
            ans.add(new ArrayList<>(l));
        }
        return ans;
    }
}
