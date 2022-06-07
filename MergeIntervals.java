package sdeSheetQues;

import java.util.*;

public class MergeIntervals {
    static class Interval {
        int start, finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    static List<Interval> mergeIntervals(Interval[] inter) {
        List<Interval> res = new ArrayList<>();
        if(inter.length == 0 || inter == null) return res;
        Arrays.sort(inter, (a, b) -> a.start - b.start);
        int start = inter[0].start;
        int end = inter[0].finish;
        for(int i=1; i<inter.length; i++) {
            if(inter[i].start <= end) {
                end = Math.max(end, inter[i].finish);
            }else {
                res.add(new Interval(start, end));
                start = inter[i].start;
                end = inter[i].finish;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }
}
