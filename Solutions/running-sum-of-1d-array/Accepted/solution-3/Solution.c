// https://leetcode.com/problems/running-sum-of-1d-array

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize){
    int* x=(int*)malloc(sizeof(int)*numsSize);
     *returnSize = numsSize;
    int sum=0;
    for(int i=0;i<numsSize;i++)
    {
       sum+=nums[i];
        x[i]=sum;
    }
    return x;
}