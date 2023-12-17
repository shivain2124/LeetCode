class Solution {
    public int romanToInt(String s) {
        char[] num = s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
    
        switch(num[i]){
            case 'I':
            num[i]=1;
            break;
            case 'V':
            num[i]=5;
            break;
            case 'X':
            num[i]=10;
            break;
            case 'L':
            num[i]=50;
            break;
            case 'C':
            num[i]=100;
            break;
            case 'D':
            num[i]=500;
            break;
            case 'M':
            num[i]=1000;
            break;
        }
    }
    
     for(int k=0;k<s.length()-1;k++){
         
        if(num[k]<num[k+1]){
            sum=sum-num[k];
            }
        else{
             sum=sum+num[k];
            }
     }    
           
        return sum+num[s.length()-1];
    }
}
