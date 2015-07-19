package org.josedab.puzzles.random.example13;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean overlapsRange(Range other) {
        return (this.start <= other.start && this.end >= other.start)
                || (other.start <= this.start && other.end >= this.start);
    }

    public Range merge(Range other) {
        int start = Math.min(this.start, other.start);
        int end = Math.max(this.end, other.end);
        return new Range(start, end);
    }

    @Override
    public String toString() {
        return new StringBuilder("[").append(start)
                                     .append(",")
                                     .append(end)
                                     .append("]")
                                     .toString();
    }


}
