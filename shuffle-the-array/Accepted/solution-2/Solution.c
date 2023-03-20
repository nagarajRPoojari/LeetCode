// https://leetcode.com/problems/shuffle-the-array



/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int* ans=(int*)malloc(sizeof(int)*numsSize);
    for(int i=0;i<numsSize;i++)
    {
        if(i<n)
        {
            ans[2*i]=nums[i];
        }
        else
        {
            ans[2*(i-n)+1]=nums[i];
        }
    }
    *returnSize=numsSize;
    return ans;
}