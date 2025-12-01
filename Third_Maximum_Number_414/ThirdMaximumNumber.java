package Third_Maximum_Number_414;

import java.util.*;

class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        List<Integer> num = new ArrayList<>(set);
        Collections.sort(num);

        if(num.size() < 3){
            return num.get(num.size() - 1);
        } else {
            return num.get(num.size() - 3);
        }
    }

    public static void main(String[] args) {
    	ThirdMaximumNumber obj = new ThirdMaximumNumber();
        int[] nums = {2, 2, 3, 1};
        System.out.println(obj.thirdMax(nums)); // 1
    }
}
