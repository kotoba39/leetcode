public class Divide {
    public int divide(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b == 1) {
            return a;
        } else if (b == -1) {
            return a == -2147483648 ? 2147483647 : 0 - a;
        } else {
            //判断符号
            boolean resultOver0 = false;
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                resultOver0 = true;
            }
            //
            a = a > 0 ? (0 - a) : a;
            b = b > 0 ? (0 - b) : b;
            int result = 0;
            a -= b;
            while (a <= 0) {
                result++;
                if (a == 0) {
                    break;
                }
                a -= b;
            }
            return resultOver0 ? result : (0 - result);
        }
    }

}
