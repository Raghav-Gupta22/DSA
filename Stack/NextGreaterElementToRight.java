Problem link: https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

class Solution
{
    public static long[] nextLargerElement(long[] nums, int n)
    { 
        Stack<Long> stack = new Stack<>();
        stack.push(nums[n-1]);
        long[] nger=new long[n];
        nger[n-1]=-1;
        
        for(int i=n-2; i>=0; i--){
            
            if(nums[i] > stack.peek()){
                while(!(stack.empty()) && stack.peek()<nums[i])
                    stack.pop();
            }
            
            if (stack.empty())
                nger[i]=-1;
            else
                nger[i]=stack.peek();
                stack.push(nums[i]);
        }
        return nger;
    }
}
