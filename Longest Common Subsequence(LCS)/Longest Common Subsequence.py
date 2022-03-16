Problem Link: https://leetcode.com/problems/longest-common-subsequence/

class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        #memoized
        m=len(text1)
        n=len(text2)
        dp=[[-1]*(n+1) for i in range(m+1)]
        def recur(m,n):
            if m==0 or n==0:
                return 0
            
            if dp[m][n]==-1:
                if text1[m-1]==text2[n-1]:
                    dp[m][n]=1+recur(m-1,n-1)
                    return dp[m][n]
                
                else:
                    dp[m][n]=max(recur(m,n-1),recur(m-1,n))
                    return dp[m][n]
                
            else:
                return dp[m][n]
        
        recur(m,n)
        print(dp)
        return dp[m][n]
         
        #TABULATION
        m=len(text1)
        n=len(text2)
        dp=[[0]*(n+1) for i in range(m+1)]
        for i in range(1,m+1):
            for j in range(1,n+1): 
                if text1[i-1] == text2[j-1]:
                    dp[i][j]=1+dp[i-1][j-1]

                else:
                    dp[i][j]=max(dp[i][j-1],dp[i-1][j])
        return dp[m][n]
