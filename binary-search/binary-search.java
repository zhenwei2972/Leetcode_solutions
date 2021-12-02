class Solution {
    public int search(int[] nums, int target) {
        
       
       int numsLength = nums.length;
       if(nums.length ==1) return (nums[0] == target) ? 0 : -1; 
       int mid = nums.length/2;
       if(target==nums[mid]) return mid;
       else
       {
           //iteriative recursive part start here
           if(nums[mid]< target) 
           {
            int ans = search(Arrays.copyOfRange(nums,mid,nums.length),target);    
                if(ans==-1)
                {
                    return -1; 
                }
                else 
                {
                    //searching second half , so must add back the middle index to preserve index order. 
                    return ans + mid;
                }
           }
           else 
           {
            return search(Arrays.copyOfRange(nums,0,mid),target);
           }
      
       }

    }
}