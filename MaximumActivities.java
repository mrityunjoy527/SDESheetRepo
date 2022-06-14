package sdeSheetQues;

import java.util.*;

public class MaximumActivities {
    static class Act {
        int st;
        int ed;
        public Act(int start, int end) {
            st = start;
            ed = end;
        }
    }
    static int maximumActivities(List<Integer> start, List<Integer> end) {
        List<Act> l = new ArrayList<>();
        for(int i=0; i<end.size(); i++) {
            l.add(new Act(start.get(i), end.get(i)));
        }
        Collections.sort(l, (a, b) -> a.ed - b.ed);
        int ans = 1;
        int ending = l.get(0).ed;
        for(int i=1; i<end.size(); i++) {
            if(l.get(i).st >= ending) {
                ending = l.get(i).ed;
                ans++;
            }
        }
        return ans;
    }
}
