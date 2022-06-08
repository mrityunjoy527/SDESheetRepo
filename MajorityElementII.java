package sdeSheetQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementII {
    static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: map.keySet()) {
            if(map.get(i) > n/3) ans.add(i);
        }
        return ans;
    }
}
