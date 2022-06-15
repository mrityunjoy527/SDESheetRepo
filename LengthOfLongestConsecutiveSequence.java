package sdeSheetQues;

import java.util.*;

public class LengthOfLongestConsecutiveSequence {
    static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        Set<Integer> set = new HashSet<>();
        for(int i: arr) set.add(i);
        int ans = 0;
        for(int i: arr) {
            if(!set.contains(i-1)) {
                int num = i;
                int l = 1;
                while(set.contains(num+1)) {
                    num += 1;
                    l += 1;
                }
                ans = Math.max(ans, l);
            }
        }
        return ans;
    }
}
