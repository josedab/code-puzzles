package org.josedab.puzzles.example13;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MergeRanges {

    public static void main(String[] args) {

        List<Range> ranges = new LinkedList<Range>();
        ranges.add(new Range(5, 13));
        ranges.add(new Range(27, 39));
        ranges.add(new Range(8, 19));
        ranges.add(new Range(31, 37));

        System.out.println(mergeRanges(ranges));

    }

    
    public static Iterable<Range> mergeRanges(List<Range> ranges) {

        Collections.sort(ranges, new Comparator<Range>() {
            @Override
            public int compare(Range r1, Range r2) {
                return r1.getStart() - r2.getStart();
            }
        });

        Stack<Range> lifoResult = new Stack<Range>();
        for (Range range : ranges) {
            if (lifoResult.isEmpty()) {
                lifoResult.push(range);
            } else {
                Range rangeOnTop = lifoResult.peek();
                if (rangeOnTop.overlapsRange(range)) {
                    lifoResult.pop();
                    lifoResult.push(rangeOnTop.merge(range));
                } else {
                    lifoResult.push(range);
                }
            }
        }

        return lifoResult;
    }

}
