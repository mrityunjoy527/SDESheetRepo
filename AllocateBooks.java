package sdeSheetQues;

public class AllocateBooks {
    static long ayushGivesNinjatest(int n, int m, int[] time) {
        long low = 0;
        long high = 0;
        for(int i: time) high += i;
        long ans = -1;
        while(low <= high) {
            long mid = (low + high) >> 1;
            if(possible(mid, n, time)) {
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean possible(long mid, int m, int[] time) {
        long chap = 0;
        int day = 1;
        for(int i=0; i<time.length; i++) {
            if(time[i] > mid) return false;
            if(chap + time[i] <= mid) {
                chap += time[i];
            }else {
                day++;
                if(day > m) return false;
                chap = time[i];
            }
        }
        return true;
    }
}
