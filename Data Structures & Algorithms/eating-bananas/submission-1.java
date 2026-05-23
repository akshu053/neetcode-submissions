//h >= piles.length
//k at max can be max(piles)
//BF: find the max value in piles, iterate over OR use while(true) ans atleast one sol is guaranteed
//BinarySearch: define the bounds, do BS

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile : piles){
            max = Math.max(max, pile);
        }

        int low = 1;
        int high = max;
        int res = high;

        while(low<=high){
            long totalTime = 0;
            int mid = (low + high)/2;

            for(int pile : piles){
                totalTime += Math.ceil((double) pile/mid);
            }
            if(totalTime <= h){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
}
