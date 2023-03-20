// https://leetcode.com/problems/count-items-matching-a-rule

/**
 * @param {string[][]} items
 * @param {string} ruleKey
 * @param {string} ruleValue
 * @return {number}
 */
var countMatches = function(items, ruleKey, ruleValue) {
    let count=0;
    let val;
    if(ruleKey=="type")
        val=0;
    else if(ruleKey=="color")
        val=1;
    else
        val=2;
    for(let i of items){
        if(i[val]==ruleValue)
            count++;
        
    }
    return count;
};