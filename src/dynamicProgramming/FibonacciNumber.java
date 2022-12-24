package dynamicProgramming;

import java.util.Arrays;

public class FibonacciNumber {



    public static void main(String[] args) {
        int n=15;
//        int[] dp=new int[n+1];
//        Arrays.fill(dp,-1);
//        long preTime=System.currentTimeMillis();
//        System.out.println(fib(15,dp));
//        long postTime=System.currentTimeMillis();
//        System.out.println("total Time " +( preTime-postTime));
//        for (int i = 0; i < dp.length; i++) {
//            System.out.print(dp[i]+" ");
//
//        }
        System.out.println(findNthFibonacci(15));



    }
    // fibonacci using memoization
    public static int fib(int n,int []dp){
        int res=0;
        if (dp[n]==-1){
            if (n==0 || n==1){
                res=n;
            }
            else {
                res=fib(n-1,dp)+fib(n-2,dp);
            }
            dp[n]=res;
        }
        return dp[n];

    }

    public static long findNthFibonacci(int number)
    {
        // Your Code Here

        long [] fib=new long[number+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=number;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[number];
    }






}
