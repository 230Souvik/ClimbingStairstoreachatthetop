
package ex30;
import java.util.*;

public class Ex30 {
static int countstrip(int n){
    int[] dp = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      dp[i] = -1;
    }
    fib(n, dp);
    return dp[n];
}
static int fib(int n, int dp[])
  {
    if (n <= 1)
      return dp[n] = 1;
 
    if (dp[n] != -1) {
      return dp[n];
    }
    dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    return dp[n];
  }
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("count is"+countstrip(n));
    }
    
}
