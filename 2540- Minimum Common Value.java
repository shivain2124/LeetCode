class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> output = new HashSet<>();

        for(int i:nums1){
            set.add(i);
        }
        for(int j:nums2){
            if(set.contains(j)){
                output.add(j);
            }
        }
        int index=0;
        int[] arr = new int[output.size()];
        for(int k:output){
            arr[index++]=k;
        }
        if(arr.length == 0){
            return -1;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}
