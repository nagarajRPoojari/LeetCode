// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences



int mostWordsFound(char ** sentences, int sentencesSize){
    int max=0,x;
    char *c;
    for(int i=0;i<sentencesSize;i++)
    {
        x=0;
        c=sentences[i];
        while(*c++){
            if(*c==' ')
                x++;
        }
        if(x>max)
            max=x;
    }
    return max+1;
}