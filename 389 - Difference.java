class Solution {
    public char findTheDifference(String s, String t) {

        int ascii=0;
        for(int i=0;i<s.length();i++){
            char character = s.charAt(i);
            ascii = ascii + (int)character;
        }
        int ascii2=0;
        for(int j=0;j<t.length();j++){
            char character2 = t.charAt(j);
            ascii2 = ascii2 + (int)character2;
        }
        int result = ascii2-ascii;

        return (char)result;
    }
}
