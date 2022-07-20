package Day1;
public class tribonacci {
   public static int ntribonacci(int n){
    int dp[]= new int[n+1];
    dp[0]=0;
    dp[1]=1;
    dp[2]=1;
    if(n==0 || n==1) return n;
    else if( n==2) return 1;
    for(int i=3; i<n ; i++){
        dp[i]= dp[i]+dp[i-1]+dp[i-2];
    }


    return dp[n];
   }
    public static void main(String[] args) {
        System.out.println(ntribonacci(6));
    }
    
}
