Problem link: https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

class Solution:
    def nextLargerElement(self,n,size):
        ans=[-1]                                    #adding -1 in final result beacuse element present in last will have no greater element present in right side. 
        stack=[n[-1]]                               #adding last element first in stack because we are iterating from backwards and till we have greatest element will be that only.
        for i in range(len(n)-2,-1,-1):             #initiating loop from backwards
            while stack!=[] and n[i]>stack[-1]:     #will pop element till stack is not empty and and the we fetch is greater than element present in stack. 
               stack.pop()
            if stack!=[]:
                ans.append(stack[-1])               #appending top element
            else:
                ans.append(-1)                      #else appending -1    
            stack.append(n[i])
        return ans[::-1]                            #printing in reverse format because we iterated in reverse
