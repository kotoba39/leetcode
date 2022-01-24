public class FirstUniqChar {

    public char firstUniqChar(String s) {
        int[] sameIndex=new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(sameIndex[i]!=0){
                continue;
            }
            char c = s.charAt(i);
            if(i==s.length()-1){
                return c;
            }
            boolean isSame=false;
            for (int j = i + 1; j < s.length(); j++) {
                if (sameIndex[j]==0&&c == s.charAt(j)) {
                    sameIndex[j]=1;
                    isSame=true;
                }
            }
            if(!isSame){
                return c;
            }
        }
        return ' ';
    }
}
