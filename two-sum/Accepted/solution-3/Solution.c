// https://leetcode.com/problems/two-sum



/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* x=malloc(2*sizeof(int));
    *returnSize=2;
    for(int i=0;i<numsSize;i++)
    {
        for(int j=0;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target && i!=j)
            { x[0]=i;
                x[1]=j;}
        }
    }
    return x;
}