package sdeSheetQues;

import java.util.ArrayList;

public class MaxConsecutiveOnes {
    static int longestSubSeg(ArrayList<Integer> a , int n, int k) {
        int i = 0, j = 0;
        while(i < a.size()) {
            if(a.get(i) == 0) k--;
            if(k < 0) {
                if(a.get(j) == 0) k++;
                j++;
            }
            i++;
        }
        return i - j;
    }
}
