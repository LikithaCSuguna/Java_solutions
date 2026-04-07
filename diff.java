import java.util.*;
class Solution {
    public int minDiff(int[] arr, int k) {
        int n=arr.length;
        if (k==0||n==0) return 0;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0;i <= n - k; i++){
            int diff = arr[i+k-1]-arr[i];
            minDiff = Math.min(minDiff,diff);
        }
        return minDiff;
    }
}
