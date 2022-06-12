package sdeSheetQues;

import java.util.ArrayList;
import java.util.*;

public class SubarraysXor {
    static int subarraysXor(ArrayList<Integer> arr, int x) {
        int cnt = 0;
        int xor = 0;
        int n = arr.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            xor ^= arr.get(i);
            if(map.containsKey(xor ^ x)) {
                cnt += map.get(xor ^ x);
            }
            if(xor == x) {
                cnt++;
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return cnt;
    }
}
