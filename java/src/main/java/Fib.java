public class Fib {
//    public int fib(int n) {
//        if(n<=0){
//            return 0;
//        }
//        if(n==0||n==1){
//            return 1;
//        }
//        return fib(n-2)+fib(n-1);
//    }

    public int fib(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int i_1=1;
        int i_2=1;
        for(int i=3;i<n;i++){
            int temp=i_1+i_2;
            i_2=i_1;
            i_1=temp;
        }
        return i_1+i_2;
    }

}
