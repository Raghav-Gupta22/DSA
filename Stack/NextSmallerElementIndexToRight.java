static int[] IndexOfNSER(int[] arr, int n){        
	Stack<int[]> stack = new Stack<>();
	int[] nser = new int[n];
	for(int i = n-1; i>-1; i--){
	    while(!stack.empty() && stack.peek()[1] > arr[i]){
			stack.pop();
	    }
	    if(!stack.empty() && stack.peek()[1] < arr[i]) {
			nser[i] = stack.peek()[1];
	    }
	    else{
			nser[i] = -1;
	    }
	    stack.push(new int[]{i, arr[i]});
	}
	return nser;
}
