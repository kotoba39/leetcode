//剑指 Offer 58 - II. 左旋转字符串
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        int slength = s.length();
        char[] clist = new char[slength];
        for (int i = 0; (i + n) < slength; i++) {
            clist[i] = s.charAt(i + n);
        }
        for (int i = 0; i < n; i++) {
            clist[slength - n + i] = s.charAt(i);
        }
        return new String(clist);
    }

}
