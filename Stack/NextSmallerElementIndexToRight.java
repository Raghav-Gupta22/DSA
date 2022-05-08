public int [] nearestSmallerElementToRight(int[] nums){
        int n=nums.length;
        int[] nserIndex = new int[n];
		Stack<ArrayList<Integer>> s = new Stack<>();

		for(int i = n - 1; i >= 0; i--) {
		    while(!s.empty() && s.peek().get(0) >= nums[i]) {
    			s.pop();
    		}
    		if(s.empty()) {
    		    nserIndex[i]=-1;
    		}
    		else  {
    		    nserIndex[i]=(s.peek().get(1));
    		}

    		ArrayList<Integer> tempList = new ArrayList<>();
    		tempList.add(nums[i]);
    		tempList.add(i);
			s.push(tempList);
		}
		return nserIndex;
    }
