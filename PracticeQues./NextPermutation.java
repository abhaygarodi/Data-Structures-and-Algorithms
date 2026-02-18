class Solution {
    public void nextPermutation(int[] nums) {
        int breakPoint = -1;
        int n = nums.length;

// find the break point 
        for(int i = n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }
// If no breakPoint that means the given array is the last permutation hence the solution will be order wise first 
        if(breakPoint == -1){
            reverseArray(nums,0,n-1);
            return;
        }
// Iterate from the end to find the element greater than the breakpoint but minimum in the remaining array and swap them
        for(int i = n-1 ;i > breakPoint; i--){
            if(nums[i] > nums[breakPoint]){
                swap(nums,i,breakPoint);
                break;
            }
        }
// since the remaining array is in decreasing order reverse it to find the minimum 
        reverseArray(nums,breakPoint+1,n-1);
    }

    public void reverseArray(int[] arr, int startPoint, int endPoint){
        for(int i=startPoint,j=endPoint;i <= j ;i++,j--) {
			swap(arr,i,j);
		}
    }

    public void swap(int[] arr, int id1, int id2){
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }
}