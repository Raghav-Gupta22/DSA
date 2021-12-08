#Problem link: https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

class Solution:
    
    #Function to calculate the span of stockâ€™s price for all n days.
    def calculateSpan(self,a,n):
        #code here
        stack=[]
        distance=[]
        span=[]
        
        for i in range(n):
            while stack!=[] and stack[-1][0]<=a[i]:
                stack.pop()
            if stack==[]:
                distance.append(-1)
            else:
                distance.append(stack[-1][1])
            stack.append([a[i],i])
        
        for i in range(n):
            span.append(i-distance[i])
        return span
