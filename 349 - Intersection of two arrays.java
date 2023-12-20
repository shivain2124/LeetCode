class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    
        Set<Integer> set = new HashSet<>();
        Set<Integer> output = new HashSet<>();
        
        for(int i:nums1){
            set.add(i);
        }       
        for(int j:nums2){
            if(set.contains(j)){
                output.add(j);
            }
        } 
        int l = output.size();
        int[] array =new int[l];
        int i=0;
        for(int k : output){
            array[i]=k;
            i++;
        } 
        return array;
    }
}
