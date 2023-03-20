// https://leetcode.com/problems/concatenation-of-array



/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize){
    int* ans=(int*)malloc(sizeof(int)*2*numsSize);
    for(int i=0;i<2*numsSize;i++)
    {
        if(i<numsSize)
            ans[i]=nums[i];
        else
            ans[i]=nums[i-numsSize];
    }
    *returnSize=2*numsSize;
    return ans;
}