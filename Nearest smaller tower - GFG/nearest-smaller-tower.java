//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			int [] ans = ob.nearestSmallestTower(arr);
			for(int i = 0; i < n; i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
	int [] nearestSmallestTower(int [] arr){
		//Write your code here
		int n=arr.length;
		int[] l=new int[n];
		int[] ans=new int[n];

		Stack<Integer> s=new Stack<>();
		for(int i=0;i<n;i++){
		    while(!s.empty() && arr[s.peek()]>=arr[i]) s.pop();
		    l[i]=s.empty() ? -1 : s.peek();
		    s.push(i);
		}
		

		
		s=new Stack<>();
		
		for(int i=n-1;i>=0;i--){
		    while(!s.empty() && arr[s.peek()]>=arr[i]) s.pop();
		    int r=s.empty() ? -1 : s.peek();
		    s.push(i);

		    if(l[i]==-1) ans[i]=r;
		    else if(r==-1) ans[i]=l[i];
		    
		    else if( i-l[i]==r-i )
		        ans[i]= arr[l[i]]<=arr[r] ?  l[i] : r;
		    else ans[i]=  i-l[i]<=r-i ? l[i] : r;
		   
		}

		
		return ans;
	}
}