package RemoteArray.SouthLight_Lin;

/**
 * 反转数组
 * 输入一个数组和k，将数组中的元素向右移动k个位置
 * 实例：
 * 输入：[1 2 3 4 5 6 7]  k=3
 * 输出：[5 6 7 1 2 3 4]
 * @author SouthLight-Lin on 2019/7/15
 */
public class RemoteArray {
    /**
     * 思路：每次将尾部数据插入到第一个，然后其余数据后移
     * 复杂度分析：O(k*n)
     */
    public void remote0(int[] nums, int k){
        if (nums==null )
            return;
        int tail = nums.length-1;
        // 循环的次数
        int count = 0;

        if (k>=nums.length){
            k = k%nums.length;
        }

        while (count<k){
            // 存储尾部数据
            int tmp = nums[tail];

            // 将前面的数据往后移动一位
            for (int i = nums.length-2; i >=0 ; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = tmp;
            count++;
        }
    }

    /**
     * 思路：
     *      使用一个k长度的数组，存放后k个数(用空间换时间）
     *  时间复杂度分析：O(n)
     *  空间复杂度分析：O(k)
     */
    public void remote(int[] nums, int k){

        if (nums == null || nums.length==1)
            return;

        if (k>=nums.length){
            k = k%nums.length;
        }

        int[] tmp = new int[k];

        int idx = 0;
        for (int i = nums.length-k; i < nums.length; i++) {
            tmp[idx++] = nums[i];
        }

        // 移动前k个数到后面
        int lo=nums.length-k-1, hi=nums.length-1;
        while (lo>=0){
            nums[hi--] = nums[lo--];
        }

        // 添加存放在tmp中的元素
        for (int i = 0; i < tmp.length; i++) {
            nums[i] = tmp[i];
        }

    }

    /**
     * 思路：
     *      三次反转.
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 这种算法很奇妙，确实应该好好理解一下，经过三次反转就能得到我们想要的结果
     * 该思想还可以用在反转字符串，输入I am student.  输出：student. am I
     */
    public void remote3(int[] nums, int k){
        // 步骤：
        // 1、把数组分为两部分，[0,length-k-1],  [length-k,length]
        // 2、分别把第一部分和第二部分反转
        // 3、最后整体反转，这样就完成了旋转

        if (nums == null || nums.length==1)
            return;

        if (k>=nums.length)
            k = k%nums.length;

        // 将左半部分反转
        reverse(nums, 0, nums.length-k-1);
        // 将右半部分反转
        reverse(nums, nums.length-k, nums.length-1);
        // 将真个数组反转
        reverse(nums, 0, nums.length-1);
    }

    private void reverse(int[] nums, int lo, int hi) {
        while(lo<hi){
            swap(nums, lo, hi);
            lo++;
            hi--;
        }
    }

    private void swap(int[] nums, int head, int i) {
        int tmp = nums[i];
        nums[i] = nums[head];
        nums[head] = tmp;
    }


    public static void main(String[] args) {
        RemoteArray remoteArray = new RemoteArray();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        remoteArray.remote3(nums, 5);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}
