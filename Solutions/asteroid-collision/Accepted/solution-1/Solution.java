// https://leetcode.com/problems/asteroid-collision

class Solution {
    
    public int[] asteroidCollision(int[] arr) {
        

        ArrayDeque<Integer> s=new ArrayDeque<>();
        for(int i:arr){
            if(i>0)
                s.push(i);
            else{
                while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(i))
                    s.pop();
                if(s.isEmpty() || s.peek()<0)
                    s.push(i);
                else if(s.peek()+i==0)
                    s.pop();
            }
            
        }
        int[] temp=new int[s.size()];
       int i=0;
        while(!s.isEmpty()){
            temp[i++]=s.removeLast();
        }
        


        return temp;

    }
}