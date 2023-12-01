class Solution {
    public int firstUniqChar(String s) {
        int []freq = new int [26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            q.add(c);
            freq[c-'a']++;
            while(!q.isEmpty()&&freq[q.peek()-'a']>1){
                q.remove();
            }
        }
        return q.isEmpty() ? -1 : s.indexOf(q.peek());
    }
}