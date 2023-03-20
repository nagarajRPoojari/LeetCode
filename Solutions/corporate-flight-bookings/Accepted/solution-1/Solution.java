// https://leetcode.com/problems/corporate-flight-bookings

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
         
        int[] ans=new int[n];
        
        for(int[] booking:bookings){
            int i=booking[0]-1;
            int j=booking[1];
            
            int seats=booking[2];
            ans[i]+=seats;
            
            if(j!=n)
                ans[j]-=seats;
        }
        int count=0;
        for(int i=0;i<n;i++){
            ans[i]+=count;
            count=ans[i];
        }
        return ans;
    }
}