public class ReplaceSpace {
    public String replaceSpace(String s) {
        if (s == null) {
            return s;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(c);
            }
        }
        return  stringBuffer.toString();
    }
}
