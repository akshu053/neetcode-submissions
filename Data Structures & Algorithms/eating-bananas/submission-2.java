// [1, 4, 3, 2]
// h hours
// k banana eating rate
// min k to eat all bananas in h hours 
// min 1 hour and max 4

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            long sum = 0;
            
            for(int pile : piles){
                sum += Math.ceil((double) pile/mid);
            }

            if(sum <= h){
                res = mid;
                high = mid-1;
            }
            else if(sum > h){
                low=mid+1;
            }
        }

        return res;

    }
}
