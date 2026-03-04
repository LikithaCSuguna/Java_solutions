class Solution{
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int maxEndingHere=arr[0];
        int minEndingHere=arr[0];
        int maxSoFar=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp=maxEndingHere;
                maxEndingHere=minEndingHere;
                minEndingHere=temp;
            }
            maxEndingHere=Math.max(arr[i],maxEndingHere*arr[i]);
            minEndingHere=Math.min(arr[i],minEndingHere*arr[i]); 
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
}


