package sdeSheetQues;

public class FindMajority {
    static int findMajority(int[] arr, int n) {
        if(n == 0) return -1;
        int el = 0, cnt = 0;
        for(int i: arr) {
            if(cnt == 0) el = i;
            if(el == i) cnt++;
            else cnt--;
        }
        if(cnt <= 0) return -1;
        return el;
    }
}
