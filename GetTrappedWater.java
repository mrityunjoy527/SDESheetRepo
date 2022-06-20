package sdeSheetQues;

public class GetTrappedWater {
    static long getTrappedWater(long[] a, int n) {
        int l = 0, r = n-1; long res = 0, maxL = 0, maxR = 0;
        while(l <= r) {
            if(a[l] <= a[r]) {
                if(a[l] > maxL) maxL = a[l];
                else res += maxL - a[l];
                l++;
            }else {
                if(a[r] >= maxR) maxR = a[r];
                else res += maxR - a[r];
                r--;;
            }
        }
        return res;
    }
}
