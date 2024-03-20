public class CountBits {
    public int[] countBits(int n) {
        int zeroNumber = 0;
        int oneNumber = 0;
        //当“0”的个数不为0时，标记“0”可能出现的位置个数
        int changeZero = -1;
        //当“0”的个数都为0时，下一个数“1”的个数为1，“0”的个数为上一个数的“1”的个数；否则遍历“0”可能出现的位置知道为0后，“0”的个数-1，“1”的个数+1
        int[] resultOne = new int[n + 1];
        resultOne[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (zeroNumber == 0) {
                zeroNumber = oneNumber;
                oneNumber = 1;
                changeZero = -1;
            } else {
                if (changeZero == -1) {
                    int allCount = oneNumber + zeroNumber - 1;
                    //changeZero=();
                    if (oneNumber > 1 && zeroNumber > 0) {
                        changeZero = oneNumber - 1;
                    }
                    zeroNumber -= 1;
                    oneNumber += 1;
                } else if (changeZero == 1) {
                    changeZero = -1;
                    zeroNumber -= 1;
                    oneNumber += 1;
                } else {
                    changeZero--;
                }
            }
            System.out.println("i=" + i + ",one=" + oneNumber + ",zeor=" + zeroNumber + ",change=" + changeZero);
            resultOne[i] = oneNumber;
        }
        return resultOne;
    }

   /* private int count(int all,int n){
        int nCount=0;
        for
    }*/

}
