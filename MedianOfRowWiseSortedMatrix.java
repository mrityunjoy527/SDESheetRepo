package sdeSheetQues;

import java.util.*;

public class MedianOfRowWiseSortedMatrix {
    static int getMedian(ArrayList<ArrayList<Integer>> matrix)
    {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int l = 1, r = (int)1e9;
        while(l <= r) {
            int md = (l+r) >> 1;
            int cnt = 0;
            for(int i=0; i<m; i++) {
                cnt += smallerThanEqualTo(matrix.get(i), md);
            }
            if(cnt <= ((m*n) >> 1)) l = md + 1;
            else r = md - 1;
        }
        return l;
    }
    static int smallerThanEqualTo(ArrayList<Integer> row, int mid) {
        int l = 0, r = row.size()-1;
        while(l <= r) {
            int m = (l+r) >> 1;
            if(row.get(m) <= mid) {
                l = m + 1;
            }else r = m - 1;
        }
        return l;
    }
}
