package sdeSheetQues;

import java.util.Arrays;

public class CalculateMinPatforms {
    static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int need = 1, i = 1, j = 0, ans = 1;
        while(i < n && j < n) {
            if(at[i] <= dt[j]) {
                need++;
                i++;
            }else if(at[i] >= dt[j]) {
                need--;
                j++;
            }if(need > ans) ans = need;
        }
        return ans;
    }
}
