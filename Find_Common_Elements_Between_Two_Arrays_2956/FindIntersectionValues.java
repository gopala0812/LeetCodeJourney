package Find_Common_Elements_Between_Two_Arrays_2956;

import java.util.*;

class FindIntersectionValues {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = 0;
        int m = 0;

        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    n++;
                    break;
                }
            }
        }

        for(int i = 0; i < nums2.length; i++) {
            for(int j = 0; j < nums1.length; j++) {
                if(nums2[i] == nums1[j]) {
                    m++;
                    break;
                }
            }
        }

        return new int[]{n, m};
    }

    public static void main(String[] args) {
        FindIntersectionValues obj = new FindIntersectionValues();
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        System.out.println(Arrays.toString(obj.findIntersectionValues(nums1, nums2)));
        
    }
}
