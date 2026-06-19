class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> ls = new ArrayList<>(hm.entrySet());
        Collections.sort(ls,(a,b) -> b.getValue().compareTo(a.getValue()));
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> e : ls){
            for(int i = 0; i < e.getValue(); i++){
                sb.append(e.getKey());
            }
        
        }
        return sb.toString();
    }
}