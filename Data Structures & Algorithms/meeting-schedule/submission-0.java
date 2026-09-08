/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((i1, i2) -> {
            if(i1.start > i2.start) return 1;
            else if(i1.start < i2.start) return -1;
            return 0;
        });

        int i,j=1,n=intervals.size();
        
        for(i=0;i<n-1;++i){
            if(intervals.get(i).end > intervals.get(j).start)
                return false;
            ++j;
        }

        return true;
    }
}
