package sdeSheetQues;

public class FindMinimumCoins {
    static int findMinimumCoins(int amount) {
        int[] deno = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = deno.length;
        int ans = 0;
        for(int i=n-1; i>=0; i--) {
            while(amount >= deno[i]) {
                amount -= deno[i];
                ans++;
            }
        }
        return ans;
    }
}
