// https://leetcode.com/problems/product-of-the-last-k-numbers

class ProductOfNumbers {
    int product;
    ArrayList<Integer> arr;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
        product=1;
    }
    
    public void add(int num) {
        if(num==0){
            arr=new ArrayList<>();
            product=1;
        }else{
            product*=num;
            arr.add(product);
        }

    }
    
    public int getProduct(int k) {
        if(k>arr.size()) return 0;

        int ans=arr.get(arr.size()-1);
        if(k==arr.size()) return ans;
        return (int)(ans/arr.get(arr.size()-1-k));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */