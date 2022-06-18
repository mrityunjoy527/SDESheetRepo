package sdeSheetQues;

import java.util.ArrayList;

public class Knapsack0_1 {
    static int maxProfit(ArrayList<Integer> val, ArrayList<Integer> wt, int n, int w) {
        int[][] dp = new int[n][w+1];
        for(int i=wt.get(0); i<=w; i++) {
            dp[0][i] = val.get(0);
        }
        for(int i=1; i<n; i++) {
            for(int j=0; j<=w; j++) {
                int not = dp[i-1][j];
                int take = 0;
                if(wt.get(i) <= j) {
                    take += val.get(i) + dp[i-1][j - wt.get(i)];
                }
                dp[i][j] = Math.max(take, not);
            }
        }
        return dp[n-1][w];
    }
}
