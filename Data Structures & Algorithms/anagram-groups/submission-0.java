class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String st: strs){
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(!map.containsKey(s)){
                map.put(s , new ArrayList<>());
            }map.get(s).add(st);
        }
        for(Map.Entry<String, List<String>> mp : map.entrySet()) {
            result.add(mp.getValue());
        }
        return result;
    }
}
