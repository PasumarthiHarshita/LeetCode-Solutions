class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;

            if(nums[low]<=nums[mid])
            {
                if(target>=nums[low] && target<nums[mid]) high=mid-1;
                else low=mid+1;
            }
            else
            {
                if(target>nums[mid] && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] nums1={4,5,6,7,0,1,2};
        int[] nums2={4,5,6,7,0,1,2};
        int[] nums3={1};
        System.out.println(s.search(nums1,0)); 
        System.out.println(s.search(nums2,3)); 
        System.out.println(s.search(nums3,0)); 
    }
}