class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int l = str.length();
        char[] c=   str.toCharArray(); 
        int i;
        
            for(i=0;i<l;i++){
                if((l-1)>=i){
                char temp=c[i];
                c[i]=c[l-1];
                c[l-1]=temp;
                l--;
                }
            }
            String Swap =new String(c);

        return str.equals(Swap);
       
    }
} 
