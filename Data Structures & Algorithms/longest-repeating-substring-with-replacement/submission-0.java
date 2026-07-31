class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==0) return 0;
        HashMap<Character , Integer> map = new HashMap<>();
        int start = 0 , length = 0 , letter = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c , 0);
            }
            map.put(c , map.get(c)+1);
            letter = Math.max(letter , map.get(c));
            int window = i - start + 1;
            if((window - letter)>k){
                char ch = s.charAt(start);
                map.put(ch , map.get(ch)-1);
                start++;
            }
            length = Math.max(length , i-start+1);
        }
        return length;
    }
}
