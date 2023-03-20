// https://leetcode.com/problems/count-items-matching-a-rule



int countMatches(char *** items, int itemsSize, int* itemsColSize, char * ruleKey, char * ruleValue){
    int count=0;
    int val;
        if(strcmp(ruleKey,"type")==0)
            val=0;
        else if(strcmp(ruleKey,"color")==0)
            val =1;
        else
            val =2;
    for(int i=0;i<itemsSize;i++){
        if(strcmp(items[i][val],ruleValue)==0)
            count++;
        
    }
    return count;
    
}