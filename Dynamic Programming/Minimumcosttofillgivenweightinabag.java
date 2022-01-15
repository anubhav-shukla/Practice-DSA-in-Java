package DSA;

public class Minimumcosttofillgivenweightinabag {
	static int[][] dp;

    static int solve(int[] cost, int[] weight, int N, int W){
        if(W < 0 || N <= 0)
            return 1000000000;

        if(W == 0)
            return 0;

        if(dp[N][W] != -1)
            return dp[N][W];

        return dp[N][W] = Math.min(cost[N-1] + solve(cost, weight, N, W - weight[N-1]), solve(cost, weight, N-1, W));
    }

    static int minimumCost(int cost[], int N,int W) {

        dp = new int[N+1][W+1];

        for(int i = 0;i <= N;i++){
            for(int j = 0;j <= W;j++){
                dp[i][j] = -1;
            }
        }

        int[] weight = new int[N];

        for(int i = 0;i < N;i++){
            weight[i] = i+1;
            if(cost[i] == -1)
                cost[i] = 1000000000;
        }

        int ans = solve(cost,weight, N, W);

        if(ans >= 1000000000)
            return -1;
        return ans;

    }
public static void main(String ar[]) {
	int N = 5, arr[] = {20, 10, 4, 50, 100};
	int W = 5;
	System.out.println(minimumCost(arr,N,W));
}
}
