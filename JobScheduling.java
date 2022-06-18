package sdeSheetQues;

import java.util.Arrays;

public class JobScheduling {
    static int jobScheduling(int[][] jobs) {
        int n = jobs.length;
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);
        int max = 0;
        for(int[] i: jobs) {
            if(i[0] > max) max = i[0];
        }
        int[] dl = new int[max+1];
        for(int i=0; i<max+1; i++) {
            dl[i] = -1;
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=jobs[i][0]; j>0; j--) {
                if(dl[j] == -1) {
                    ans += jobs[i][1];
                    dl[j] = i;
                    break;
                }
            }
        }
        return ans;
    }
}
