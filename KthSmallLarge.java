package sdeSheetQues;

import java.util.*;

public class KthSmallLarge {
    static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);
        for(int i: arr) {
            min.add(i);
            max.add(i);
            if(min.size() > k) {
                min.poll();
            }
            if(max.size() > k) {
                max.poll();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(max.poll());
        ans.add(min.poll());
        return ans;
    }
}
