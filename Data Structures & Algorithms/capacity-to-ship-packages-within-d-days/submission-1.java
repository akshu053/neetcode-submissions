class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int res = 0;
        int low = 0;
        for(int i : weights){
            low = Math.max(low, i);
        }
        int high = Arrays.stream(weights).sum();

        while(low <= high){
            int mid = low + (high - low)/2;
            int sum = 0;
            int ct = 1;
            for(int wt : weights){
                sum += wt;
                if(ct > days){
                    break;
                }
                if(sum > mid){
                    sum = wt;
                    ct++;
                }
            }
            if(ct <= days){
                res = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }

        }
        return res;
    }
}