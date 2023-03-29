//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countSubstring(String s) 
    { 
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(char c:s.toCharArray()){
            sum+=Character.isUpperCase(c)? 1 : -1;
            count+= map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
} 
