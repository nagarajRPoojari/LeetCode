// https://leetcode.com/problems/categorize-box-according-to-criteria

import java.math.BigInteger;  

class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        Boolean isBulky=false,isHeavy=false;
        BigInteger lb=BigInteger.valueOf(l);
        BigInteger wb=BigInteger.valueOf(w);
        BigInteger hb=BigInteger.valueOf(h);
        BigInteger v=lb.multiply(wb).multiply(hb);
        if(l>=1e4 || w>=1e4 || h>=1e4 || v.compareTo(new BigInteger("1000000000"))>=0) isBulky=true;
        if(m>=100) isHeavy=true;
        
        System.out.println(isBulky);
        
        if(isBulky && isHeavy) return "Both";
        if(!isBulky && !isHeavy) return "Neither";
        if(isBulky) return "Bulky";
        else return "Heavy";
    }
}