class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        int start = 0 , length = 1 , i=0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                i++;
                length = Math.max(length , i-start);
            }
            else if(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            //length = Math.max(length , i-start);
        }
        return length;
    }
}
