class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = Arrays.stream(candies).max().getAsInt();
        List<Boolean>res = new ArrayList<>();
        for(int i:candies){
            if(i+extraCandies>=m)res.add(true);
            else res.add(false);
        }
        return res;
    }
}