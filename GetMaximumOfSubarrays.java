package sdeSheetQues;

import java.util.*;

public class GetMaximumOfSubarrays {
    static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<nums.size(); i++) {
            if(!dq.isEmpty() && dq.peek() == i - k) dq.poll();
            while(!dq.isEmpty() && nums.get(dq.peekLast()) < nums.get(i)) dq.pollLast();
            dq.offer(i);
            if(i >= k-1) ans.add(nums.get(dq.peek()));
        }
        return ans;
    }
}
