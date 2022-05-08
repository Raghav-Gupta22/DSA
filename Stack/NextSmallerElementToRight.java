public int [] nearestSmallerElementToRight(int[] nums){
        int n=nums.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[n-1]);
        int[] nser=new int[n];
        nser[n-1]=-1;
        
        for(int i=n-2; i>=0; i--){
            
            if(nums[i] < stack.peek()){
                while(!(stack.empty()) && stack.peek()>nums[i])
                    stack.pop();
            }
            
            if (stack.empty())
                nser[i]=-1;
            else
                nser[i]=stack.peek();
                stack.push(nums[i]);
        }
        return nser;
    }
