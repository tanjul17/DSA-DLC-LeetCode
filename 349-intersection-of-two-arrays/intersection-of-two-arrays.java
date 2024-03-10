class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s1 = new HashSet<>();
        for(int i :nums1){
            s1.add(i);
        }
        ArrayList<Integer>al = new ArrayList<>();
        for (int i : nums2) {
            if(s1.contains(i)){
                al.add(i);
                s1.remove(i);
            }
        }
        int r [] = new int [al.size()];
        for(int i=0;i<al.size();i++){
            r[i]=al.get(i);
        }
        return r;
    }
}