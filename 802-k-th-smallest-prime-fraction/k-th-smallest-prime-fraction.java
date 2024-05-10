import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingDouble(a -> (double) a[0] / a[1]));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                minHeap.offer(new int[]{arr[i], arr[j]});
            }
        }
        
        int[] result = null;
        for (int i = 0; i < k; ++i) {
            result = minHeap.poll();
        }

        return result;
    }
}



        // int res[] = new int[2];
        // ArrayList<Double>al = new ArrayList<>();
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         al.add((double)arr[i]/arr[j]);
        //     }
        // }
        // Collections.sort(al);
        // double f = al.get(k-1);
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]/arr[j]==f){
        //             res[0]=arr[i];
        //             res[1]=arr[j];
        //         }
        //     }
        // }
        // return res;
    