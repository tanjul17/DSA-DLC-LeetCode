class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();
        for(String s :strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String st = new String(c);

            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
//appraoch
/*
    make char arr
    store s to char
    sort the char arr
    make sort string key
    store anagram in map
    and add values of map
    return values arrlist
 */