package sdeSheetQues;

import java.util.*;

public class MaximumMeetings {
    static class Meeting {
        int ind;
        int st;
        int ed;
        public Meeting(int index, int start, int end) {
            ind = index;
            st = start;
            ed = end;
        }
    }
    static List<Integer> maximumMeetings(int[] start, int[] end) {
        List<Integer> ans = new ArrayList<>();
        List<Meeting> l = new ArrayList<>();
        for(int i=0; i<start.length; i++) {
            l.add(new Meeting(i+1, start[i], end[i]));
        }
        Collections.sort(l, (a, b) -> a.ed - b.ed);
        ans.add(l.get(0).ind);
        int ending = l.get(0).ed;
        for(int i=1; i<start.length; i++) {
            if(l.get(i).st > ending) {
                ans.add(l.get(i).ind);
                ending = l.get(i).ed;
            }
        }
        return ans;
    }
}
