// https://leetcode.com/problems/evaluate-reverse-polish-notation

class Solution {
    static int eval(int a,int b,String c){
        switch(c){
            case "+": return a+b;
            case "-": return a-b;
            case "/": return a/b;
            case "*": return a*b;
        }
        return -1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String i : tokens){
            if(Character.isDigit(i.charAt(0))){
                s.push(Integer.parseInt(i));
            }else if(i.charAt(0)=='-' && i.length()>=2){
                s.push(Integer.parseInt(i));
                
            }
            
            else{
                int b=s.pop();
                int a=s.pop();
                s.push(eval(a,b,i));
            }
            System.out.println(s.toString());
        }
        return s.peek();
    }
}