package sdeSheetQues;

import list.Pair;

import java.util.*;

public class FractionalKnapsack {
    class Pair {
        int weight;
        int value;
        Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
    static double maximumValue(Pair[] items, int n, int w) {
        Arrays.sort(items, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.value/o1.weight > o2.value/o2.weight) return -1;
                else if(o1.value/o1.weight < o2.value/o2.weight) return 1;
                return 0;
            }
        });
        int cur = 0;
        double val = 0;
        for(int i=0; i<n; i++) {
            if(cur + items[i].weight <= w) {
                cur += items[i].weight;
                val += items[i].value;
            }else {
                int rem = w - cur;
                val += ((double)items[i].value/(double)items[i].weight) * (double)rem;
            }
        }
        return val;
    }
}
