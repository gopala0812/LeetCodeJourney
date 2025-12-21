package Stable_Mountains_2864;

import java.util.*;

class StableMountains {

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 1; i < height.length; i++) {
            if(height[i - 1] > threshold) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        StableMountains obj = new StableMountains();
        int[] height = {1, 2, 3, 4, 5};
        int threshold = 2;
        System.out.println(obj.stableMountains(height, threshold)); // [3, 4]
    }
}
