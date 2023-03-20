// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box



/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* minOperations(char * boxes, int* returnSize){
    int size=strlen(boxes);
    int* ans=(int*)malloc(sizeof(int)*size);
    for(int i=0;i<size;i++)
    {
        ans[i]=0;
        for(int j=0;j<size;j++)
        {
            if(boxes[j]=='1')
            {
                ans[i]+=fabs(i-j);
            }
        }
    }
    *returnSize=size;
    return ans;
}