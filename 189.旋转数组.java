/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    // public void rotate(int[] nums, int k) {
    //     int temp,third;
    //     k = k % nums.length;
    //     for (int j = 0; j < k; j++) {
    //         third = nums[nums.length-1];
    //         for (int i = 0; i < nums.length; i++) {
    //             temp = nums[i];
    //             nums[i]= third;
    //             third = temp;
    //         }
    //     }
    // }

    //用第三者数组
    // public void rotate(int[] nums, int k) {
    //     int[] third = new int[nums.length];
        
    //     for (int i = 0; i < nums.length; i++) {
    //         third[(i+k)%nums.length] = nums[i];
    //     }
    //     for (int i = 0; i < third.length; i++) {
    //         nums[i] = third[i];
    //     }
    // }

    //反转
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        //全部反转
        revorse(nums,0,nums.length-1);
        //反转前k个
        revorse(nums,0,k-1);//这个地方是k-1
        revorse(nums,k,nums.length-1);//这个地方从k开始
    }
    public void revorse(int[] num,int i,int j){
        //把开始的和最后的调换位置，值到开始的下标大于结束的下标
        while(i < j) {  //这个地方是小于号
            int tem;
            tem = num[i];
            num[i] = num[j];
            num[j] = tem;
            i++;
            j--;
        } 
    }

}
// @lc code=end

