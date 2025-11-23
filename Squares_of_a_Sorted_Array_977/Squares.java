package Squares_of_a_Sorted_Array_977;

import java.util.*;

class Squares {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
    
    public static void main(String[] args) {
    	int[] nums= {-2,1,2,4,5};
    	
    	Squares s=new Squares();
    	int[] res=s.sortedSquares(nums);
    	
    	System.out.println(Arrays.toString(res));
    }
}