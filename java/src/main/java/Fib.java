public class Fib {
//    public static int fib(int n) {
//        if(n<=0){
//            return 0;
//        }
//        if(n==0||n==1){
//            return 1;
//        }
//        return fib(n-2)+fib(n-1);
//    }

    public static int fib(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int i_1=1;
        int i_2=1;
        for(int i=3;i<n+1;i++){
            int temp=i_1+i_2;
            i_2=i_1;
            i_1=temp%1000000007;
        }
        return i_1;
    }


//    public static int fib(int n) {
//        final int MOD = 1000000007;
//        if (n < 2) {
//            return n;
//        }
//        int p = 0, q = 0, r = 1;
//        for (int i = 2; i <= n; ++i) {
//            p = q;
//            q = r;
//            r = (p + q) % MOD;
//        }
//        return r;
//    }
    public static void main(String[] args) {
        System.out.println(fib(43));
    }

}
