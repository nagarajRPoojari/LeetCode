// https://leetcode.com/problems/final-value-of-variable-after-performing-operations



int finalValueAfterOperations(char ** operations, int operationsSize){
    int x=0;
    for(int i=0;i<operationsSize;i++)
    {
        if(operations[i][0]=='+' || operations[i][2]=='+')
            x++;
        else
            x--;
    }
    return x;
}