public class AddBinary {
    public String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        String zero = "";
        boolean isABigger = alen > blen ? true : false;
        for (int i = 0; i < (isABigger ? (alen - blen) : (blen - alen)); i++) {
            zero += "0";
        }
        if (isABigger) {
            b = zero + b;
        } else {
            a = zero + a;
        }
        int upper = 0;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int anum = a.charAt(i) - 60;
            int bnum = b.charAt(i) - 60;
            int thisResult = anum + bnum + upper;
            if (thisResult < 2) {
                upper = 0;
                result = "" + thisResult + result;
            } else {
                upper = 1;
                result = "" + (thisResult - 2) + result;
            }
        }
        if (upper >= 1) {
            result = "" + upper + result;
        }
        return result;
    }
}
