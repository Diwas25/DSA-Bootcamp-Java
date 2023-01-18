package Easy;

//Kadane's Algorithm

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            bestSum = Math.max(bestSum,currentSum);
        }
        return bestSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
