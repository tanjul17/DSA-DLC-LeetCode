class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
     int n = intervals.length;
     if(n<=1) return 0;
     Arrays.sort(intervals,(a,b)->a[1]-b[1]);
     int c = 0;
     int end = intervals[0][1];
     for(int i = 1;i<n;i++){
         if(intervals[i][0]<end){
             c++;
             end  = Math.min(end,intervals[i][1]);
         }else{
             end  = intervals[i][1];
         }   
        }
    return c;
    }
}