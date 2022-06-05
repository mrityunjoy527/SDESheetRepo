package sdeSheetQues;

import java.util.HashMap;

public class UniqueSubstrings {
    static int uniqueSubstrings(String input) {
        int n = input.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int j = 0;
        for(int i=0; i<n; i++) {
            char c = input.charAt(i);
            if(map.containsKey(c)) {
                j = Math.max(j, map.get(c)+1);
            }
            map.put(c, i);
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}
