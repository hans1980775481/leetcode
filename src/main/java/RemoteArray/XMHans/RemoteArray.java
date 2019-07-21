package RemoteArray.XMHans;

public class RemoteArray {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[(i+k)%len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }
    }

    /*
    1 2 3 4 5  step = 2;
    5 4 3 2 1
    4 5 3 2 1
    4 5 1 2 3
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);  // reverse the whole array
        reverse(nums, 0, k-1);  // reverse the first part
        reverse(nums, k, nums.length-1);  // reverse the second part
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = tmp;
        }
    }
    */
}
