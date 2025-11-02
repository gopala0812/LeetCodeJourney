package Remove_Element_27;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
    	RemoveElement r=new RemoveElement();
    	
    	int[] num = {3, 2, 2, 3};
    	int s=r.removeElement(num, 3);
    	System.out.println(s);
    }
}
