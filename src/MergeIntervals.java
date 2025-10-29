import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        
        // Sort intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);
        
        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                // Overlapping intervals, merge them
                current[1] = Math.max(current[1], interval[1]);
            } else {
                // Disjoint intervals, add to list and update current
                current = interval;
                merged.add(current);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
    
    public static void main(String[] args) {
        int[][] intervals = {{1,5},{3,7},{4,6},{6,8},{10,12},{12,15}};
        int[][] merged = merge(intervals);
        System.out.println("Merged intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
