package denemeler;

public class Deneme2 {

    public int centeredAverage(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != min) {
                count += nums[i];
            }
        }
        return   count /(nums.length - 2);
    }
}
