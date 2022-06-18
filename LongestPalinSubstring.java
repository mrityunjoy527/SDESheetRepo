package sdeSheetQues;

public class LongestPalinSubstring {
    static String longestPalinSubstring(String s) {
        int n = s.length();
        int st = 0, en = 1;
        for(int i=0; i<n; i++) {
            int l = i-1;
            int r = i;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if(r-l+1 > en) {
                    st = l;
                    en = r-l+1;
                }
                l--;
                r++;
            }
            l = i-1;
            r = i+1;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if(r-l+1 > en) {
                    st = l;
                    en = r-l+1;
                }
                l--;
                r++;
            }
        }
        String ans = "";
        for(int i=st; i<st+en; i++) {
            ans += s.charAt(i);
        }
        return ans;
    }
}
