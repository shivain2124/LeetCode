class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = new char[s.length()];
        char[] arr2 = new char[t.length()];
        if(s.length()==t.length()){

        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            arr2[j] = t.charAt(j);
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr,arr2);
      }
      return false;
    }
}
