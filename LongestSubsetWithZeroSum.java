package sdeSheetQues;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubsetWithZeroSum {
    static int longestSubsetWithZeroSum(ArrayList<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
            if(sum == 0) {
                ans = i+1;
            }if(map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            }else map.put(sum, i);
        }
        return ans;
    }
}
