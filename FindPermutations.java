package sdeSheetQues;

import java.util.*;

public class FindPermutations {
    static List<String> findPermutations(String s) {
        List<String> ans = new ArrayList<>();
        stringPermutation(s, 0, s.length()-1, ans);
        return ans;
    }
    static void stringPermutation(String a, int l, int r, List<String> ans){
        if(l == r){
            ans.add(a);
        }
        for(int i = l; i <= r; i++){
            a = interchange(a, l, i);
            stringPermutation(a, l + 1, r,ans);
            a = interchange(a, l, i);
        }
    }
    static String interchange(String s, int l, int r){
        char a[] = s.toCharArray();
        char temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        return String.valueOf(a);
    }
}
