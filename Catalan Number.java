//Recursive
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(catalanNumber(n));
    }

    static int catalanNumber(int n) {
        int ans = 0;
        if (n <= 1) return 1;
        for (int i = 0; i < n; i++) {
            ans += catalanNumber(i) * catalanNumber(n - i - 1);
        }
        return ans;
    }
}

//Tabulation
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] =1;
        dp[1] =1;
        System.out.println(catalanNumber(n, dp));
        System.out.println(Arrays.toString(dp));
    }

    static int catalanNumber(int n, int[] dp) {
        if (n <= 1) return dp[n];

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
}
